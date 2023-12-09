package br.edu.infnet.appJogos.model.domain;

import java.util.List;

public class Solicitante {

    private int id;
    private String nome;
    private String cpf;
    private String email;
    private List<Pedido> pedidos;


    @Override
    public String toString() {

        return String.format("nome (%s) - cpf (%s) - email (%s)",
                nome, cpf, email
        );
    }

    public Solicitante() {

    }

    public Solicitante(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
