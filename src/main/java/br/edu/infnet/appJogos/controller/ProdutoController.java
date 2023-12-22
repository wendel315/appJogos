package br.edu.infnet.appJogos.controller;

import br.edu.infnet.appJogos.model.domain.Produto;
import br.edu.infnet.appJogos.model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping(value = "/listar")
    public List<Produto> obterLista(){
        return (List<Produto>) produtoService.obterLista();
    }

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Produto produto) {
        produtoService.incluir(produto);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        produtoService.excluir(id);
    }
}
