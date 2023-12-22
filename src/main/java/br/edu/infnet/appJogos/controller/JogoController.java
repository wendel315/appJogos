package br.edu.infnet.appJogos.controller;

import br.edu.infnet.appJogos.model.domain.Jogo;
import br.edu.infnet.appJogos.model.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bebida")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping(value = "/listar")
    public List<Jogo> obterLista(){
        return (List<Jogo>) jogoService.obterLista();
    }

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Jogo jogo) {
        jogoService.incluir(jogo);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        jogoService.excluir(id);
    }
}