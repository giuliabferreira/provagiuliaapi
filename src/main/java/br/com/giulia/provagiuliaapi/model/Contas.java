package br.com.giulia.provagiuliaapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity

@Table(name="contas")
public class Contas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String descricao;


    @ManyToOne
    @JoinColumn(name="idcliente")
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contas contas = (Contas) o;
        return id.equals(contas.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
