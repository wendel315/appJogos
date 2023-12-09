package br.edu.infnet.appJogos.model.service;

import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appJogos.model.domain.Jogo;

@Service
public class JogoService {

    private Map<Integer, Jogo> mapa = new HashMap<>();

    public void incluir(Jogo jogo) {
        mapa.put(jogo.getCodigo(), jogo);
    }

    public Collection<Jogo> obterLista() {
        return mapa.values();
    }
}
