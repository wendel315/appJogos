package br.edu.infnet.appJogos.model.service;

import java.util.Collection;

import br.edu.infnet.appJogos.model.domain.Solicitante;
import br.edu.infnet.appJogos.model.repositories.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SolicitanteService {

    @Autowired
    private SolicitanteRepository solicitanteRepository;

    public void incluirSolicitante(Solicitante solicitante){
        solicitanteRepository.save(solicitante);
    }

    public Collection<Solicitante> obterListaSolicitantes(){
        return (Collection<Solicitante>) solicitanteRepository.findAll();
    }
}