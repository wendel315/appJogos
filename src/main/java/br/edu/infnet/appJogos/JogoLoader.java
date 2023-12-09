package br.edu.infnet.appJogos;

import br.edu.infnet.appJogos.model.domain.Jogo;
import br.edu.infnet.appJogos.model.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Order(2)
@Component
public class JogoLoader implements ApplicationRunner {

    @Autowired
    private JogoService jogoService;

    @Override
    public void run(ApplicationArguments args) throws IOException {

        try (BufferedReader leitura = new BufferedReader(new FileReader("files/jogos.txt"))) {

            String linha = leitura.readLine();
            String[] campos;

            while (linha != null) {
                campos = linha.split(";");

                Jogo jogo = new Jogo();
                jogo.setNome(campos[0]);
                jogo.setValor(Float.valueOf(campos[1]));
                jogo.setCodigo(Integer.valueOf(campos[2]));
                jogo.setPlataforma(campos[3]);
                jogo.setClassificacaoIndicativa(converterClassificacao(campos[4]));
                jogo.setOnline(Boolean.valueOf(campos[5]));
                jogo.setGenero(campos[6]);

                jogoService.incluir(jogo);

                linha = leitura.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Jogo jogo : jogoService.obterLista()) {
            System.out.println("[JOGO] " + jogo);
        }
    }


    private int converterClassificacao(String classificacao) {
        if ("E".equalsIgnoreCase(classificacao)) {
            return 0;
        } else {
            return Integer.parseInt(classificacao);
        }
    }
}
