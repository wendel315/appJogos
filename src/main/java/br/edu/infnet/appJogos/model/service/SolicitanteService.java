package br.edu.infnet.appJogos.model.service;

import java.util.Collection;

import br.edu.infnet.appJogos.model.domain.Endereco;
import br.edu.infnet.appJogos.model.domain.Solicitante;
import br.edu.infnet.appJogos.model.repositories.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SolicitanteService {

    @Autowired
    private SolicitanteRepository solicitanteRepository;
    @Autowired
    private EnderecoService enderecoService;

    public void incluirSolicitante(Solicitante solicitante){

        String cep = solicitante.getEndereco().getCep();

        Endereco endereco = enderecoService.buscarCep(cep);

        solicitante.setEndereco(endereco);

        solicitanteRepository.save(solicitante);
    }

    public Collection<Solicitante> obterListaSolicitantes(){
        return (Collection<Solicitante>) solicitanteRepository.findAll();
    }

    public void excluir(Integer id) {
        solicitanteRepository.deleteById(id);
    }
}