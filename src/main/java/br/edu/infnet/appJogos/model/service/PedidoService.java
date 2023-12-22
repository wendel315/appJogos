package br.edu.infnet.appJogos.model.service;

import java.util.Collection;

import br.edu.infnet.appJogos.model.domain.Pedido;
import br.edu.infnet.appJogos.model.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void incluir(Pedido pedido){
        pedidoRepository.save(pedido);
    }

    public Collection<Pedido> obterLista(){
        return (Collection<Pedido>) pedidoRepository.findAll();
    }

    public void excluir(Integer id) {
        pedidoRepository.deleteById(id);
    }
}