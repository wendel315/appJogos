package br.edu.infnet.appJogos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;

import br.edu.infnet.appJogos.model.domain.Jogo;
import br.edu.infnet.appJogos.model.domain.Pedido;
import br.edu.infnet.appJogos.model.domain.Produto;
import br.edu.infnet.appJogos.model.domain.Solicitante;
import br.edu.infnet.appJogos.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Order(2)
@Component
public class PedidoLoader implements ApplicationRunner {

    @Autowired
    private PedidoService pedidoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/pedidos.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        Pedido pedido = null;

        while(linha != null) {
            campos = linha.split(";");

            switch (campos[0]) {
                case "P":
                    pedido = new Pedido();
                    pedido.setDescricao(campos[1]);
                    pedido.setWeb(Boolean.valueOf(campos[2]));
                    pedido.setData(LocalDateTime.now());
                    pedido.setSolicitante(new Solicitante(Integer.valueOf(campos[3])));
                    pedido.setProdutos(new ArrayList<Produto>());


                    break;

                case "J":
                    Jogo jogo = new Jogo();
                    jogo.setId(Integer.valueOf(campos[1]));

                    pedido.getProdutos().add(jogo);

                    break;

                default:
                    break;
            }

            linha = leitura.readLine();
        }

        pedidoService.incluir(pedido);

        for(Pedido p : pedidoService.obterLista()) {
            System.out.println("[PEDIDO] " + p);
        }

        leitura.close();
    }

    private int converterClassificacao(String classificacao) {
        if ("E".equalsIgnoreCase(classificacao)) {
            return 0;
        } else {
            return Integer.parseInt(classificacao);
        }
    }

}
