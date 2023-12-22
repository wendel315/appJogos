package br.edu.infnet.appJogos.model.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Jogo extends Produto {

    private String plataforma;
    private int classificacaoIndicativa;
    private boolean online;
    private String genero;


    @Override
    public String toString() {
        return String.format("%s - plataforma (%s) - classificação (%d) - online (%s) - gênero (%s)",
                super.toString(), plataforma, classificacaoIndicativa, online, genero
        );
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
