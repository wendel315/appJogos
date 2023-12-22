package br.edu.infnet.appJogos;

import java.io.BufferedReader;
import java.io.FileReader;

import br.edu.infnet.appJogos.model.domain.Endereco;
import br.edu.infnet.appJogos.model.domain.Solicitante;
import br.edu.infnet.appJogos.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(1)
@Component
public class SolicitanteLoader implements ApplicationRunner {

    @Autowired
    private SolicitanteService solicitanteService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/solicitantes.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while(linha != null) {
            campos = linha.split(";");

            Solicitante solicitante = new Solicitante();
            solicitante.setNome(campos[0]);
            solicitante.setCpf(campos[1]);
            solicitante.setEmail(campos[2]);
            solicitante.setEndereco(new Endereco(campos[3]));

            solicitanteService.incluirSolicitante(solicitante);

            linha = leitura.readLine();
        }

        for(Solicitante solicitante : solicitanteService.obterListaSolicitantes()) {
            System.out.println("[SOLICITANTE] " + solicitante);
        }

        leitura.close();
    }
}