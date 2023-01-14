package com.educamais.entities;

import jakarta.persistence.*;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_alunos")
public class Aluno implements Serializable {

    @Id
    private Long id;
    private String name;
    private String escola;
    private Double carteira;

    @OneToMany
    private List<ItemExtrato> extrato = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(Long id, String name, String escola) {
        this.id = id;
        this.name = name;
        this.escola = escola;
        this.carteira = 0.0;
    }

    public void addItemExtrato(ItemExtrato ie){
        this.extrato.add(ie);
        updateCarteira(ie.getValor());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public List<ItemExtrato> getExtrato() {
        return extrato;
    }

    public Double getCarteira() {
        return carteira;
    }

    public void updateCarteira(Double valor) {
        this.carteira += valor;
    }
}
