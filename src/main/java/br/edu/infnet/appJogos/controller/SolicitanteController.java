package br.edu.infnet.appJogos.controller;

import br.edu.infnet.appJogos.model.domain.Solicitante;
import br.edu.infnet.appJogos.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/solicitante")
public class SolicitanteController {

    @Autowired
    private SolicitanteService solicitanteService;

    @GetMapping(value = "/listar")
    public List<Solicitante> obterLista() {
        return (List<Solicitante>) solicitanteService.obterListaSolicitantes();
    }

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Solicitante solicitante) {
        solicitanteService.incluirSolicitante(solicitante);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        solicitanteService.excluir(id);
    }
}
