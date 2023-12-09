package br.edu.infnet.appJogos.model.service;

import br.edu.infnet.appJogos.model.domain.Solicitante;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;;
import java.util.Map;

@Service
public class SolicitanteService {

    private Map<String, Solicitante> solicitantes = new HashMap<>();

    public Solicitante obterSolicitantePorId(int id) {
        return solicitantes.get(id);
    }

    public void incluirSolicitante(Solicitante solicitante) {
        solicitantes.put(solicitante.getCpf(), solicitante);
    }

    public Collection<Solicitante> obterListaSolicitantes(){
        return solicitantes.values();
    }
}
