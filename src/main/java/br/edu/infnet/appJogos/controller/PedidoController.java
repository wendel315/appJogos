package br.edu.infnet.appJogos.controller;

import br.edu.infnet.appJogos.model.domain.Pedido;
import br.edu.infnet.appJogos.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping(value = "/listar")
    public List<Pedido> obterLista() {
        return (List<Pedido>) pedidoService.obterLista();
    }

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Pedido pedido) {
        pedidoService.incluir(pedido);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {
        pedidoService.excluir(id);
    }
}