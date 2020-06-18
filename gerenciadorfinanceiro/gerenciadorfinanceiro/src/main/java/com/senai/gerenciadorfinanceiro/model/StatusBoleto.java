package com.senai.gerenciadorfinanceiro.model;

public enum StatusBoleto {
    PENDENTE("Pendente"), PAGO("Pago"), EMATRASO("Em atraso");

    private String descricao; // variavel criada para ser utilizada no contrutor

    StatusBoleto(String descricao) { // metodo construtor onde precisa ser passado uma string(descricao)
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}