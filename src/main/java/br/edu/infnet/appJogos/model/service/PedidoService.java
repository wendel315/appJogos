package br.edu.infnet.appJogos.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appJogos.model.domain.Pedido;
import org.springframework.stereotype.Service;



@Service
public class PedidoService {

    private Map<String, Pedido> mapa = new HashMap<String, Pedido>();

    public void incluir(Pedido pedido){
        mapa.put(pedido.getDescricao(), pedido);
    }

    public Collection<Pedido> obterLista(){
        return mapa.values();
    }
}