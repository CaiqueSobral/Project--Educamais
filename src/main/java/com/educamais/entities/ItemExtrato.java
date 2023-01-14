package com.educamais.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_itemExtrato")
public class ItemExtrato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;
    private String status;
    private Double valorFinal;

    private Instant moment;

    public ItemExtrato() {
    }

    public ItemExtrato(Atividade atividade, String status) {
        this.atividade = atividade;
        this.status = status;
        this.moment = Instant.now();
        this.valorFinal = status.toLowerCase() == "positivo" ? atividade.getValor() : atividade.getValor() * -2;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getValor() {
        return valorFinal;
    }

    public void setValor(Double valor) {
        this.valorFinal = valor;
    }

    public Instant getMoment() {
        return moment;
    }
}
