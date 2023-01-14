package com.educamais.entities.dto;

import com.educamais.entities.ItemExtrato;

import java.util.ArrayList;
import java.util.List;

public class AlunoDTO {

    private Long id;
    private String name;
    private String escola;
    private Double carteira;

    private List<ItemExtrato> extrato = new ArrayList<>();

    public AlunoDTO() {
    }

    public AlunoDTO(Long id, String name, String escola, Double carteira, List<ItemExtrato> extrato) {
        this.id = id;
        this.name = name;
        this.escola = escola;
        this.carteira = carteira;
        this.extrato = extrato;
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

    public Double getCarteira() {
        return carteira;
    }

    public void setCarteira(Double carteira) {
        this.carteira = carteira;
    }
}
