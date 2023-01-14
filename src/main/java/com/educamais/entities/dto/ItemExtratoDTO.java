package com.educamais.entities.dto;

import com.educamais.entities.Aluno;
import com.educamais.entities.Atividade;

import java.time.Instant;

public class ItemExtratoDTO {

    private Long id;
    private AlunoDTO aluno;
    private AtividadeDTO atividade;
    private String status;
    private Double valorFinal;
    private Instant moment;

    public ItemExtratoDTO() {
    }

    public ItemExtratoDTO(Long id, AlunoDTO aluno, AtividadeDTO atividade, String status, Double valorFinal, Instant moment) {
        this.id = id;
        this.aluno = aluno;
        this.atividade = atividade;
        this.status = status;
        this.valorFinal = valorFinal;
        this.moment = moment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AlunoDTO getAluno() {
        return aluno;
    }

    public void setAluno(AlunoDTO aluno) {
        this.aluno = aluno;
    }

    public AtividadeDTO getAtividade() {
        return atividade;
    }

    public void setAtividade(AtividadeDTO atividade) {
        this.atividade = atividade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }
}
