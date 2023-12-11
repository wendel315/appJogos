package br.edu.infnet.appJogos.model.domain;



import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;
    private LocalDateTime data;
    private boolean web;
    @Transient
    private Solicitante solicitante;
    @Transient
    private List<Produto> produtos;

    @Override
    public String toString() {

        return String.format("id (%d) - descricao (%s) - data (%s) - web (%s) - solicitante (%s) - produtos(%s)",
                id, descricao, data, web, solicitante, produtos
        );
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}