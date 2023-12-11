package br.edu.infnet.appJogos.model.service;

import java.util.Collection;

import br.edu.infnet.appJogos.model.domain.Jogo;
import br.edu.infnet.appJogos.model.repositories.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public void incluir(Jogo jogo){
        jogoRepository.save(jogo);
    }

    public Collection<Jogo> obterLista(){
        return (Collection<Jogo>) jogoRepository.findAll();
    }
}