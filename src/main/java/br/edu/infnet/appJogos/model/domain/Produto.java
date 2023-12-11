package br.edu.infnet.appJogos.model.domain;

import br.edu.infnet.appJogos.model.domain.Pedido;

import java.util.List;

import javax.persistence.*;

@MappedSuperclass
public abstract class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private float valor;
    private int codigo;

    @ManyToMany(mappedBy = "produtos")
    private List<Pedido> pedidos;


    @Override
    public String toString() {

        return String.format("nome (%s) - valor (%.2f) - codigo (%d)",
                nome, valor, codigo
        );
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}