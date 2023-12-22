package br.edu.infnet.appJogos.model.service;

import br.edu.infnet.appJogos.model.domain.Produto;
import br.edu.infnet.appJogos.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void incluir(Produto produto){
        produtoRepository.save(produto);
    }

    public Collection<Produto> obterLista(){
        return (Collection<Produto>) produtoRepository.findAll();
    }

    public void excluir(Integer id) {
        produtoRepository.deleteById(id);
    }
}
