package com.senai.gerenciador_financeiro.model;

public enum StatusBoleto { //enumerador
    PENDENTE("Pendente"),
    PAGO("Pago"),
    VENCIDO("Em atraso");

    private String descricao; //variável criada para ser utilizada no construtor

    StatusBoleto(String descricao){ //método construtor onde precisa ser passado uma string(descricao)
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}