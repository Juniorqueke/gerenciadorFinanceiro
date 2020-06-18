package com.senai.gerenciadorfinanceiro.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import ch.qos.logback.core.status.Status;

@Entity // Cria uma entidade JPA para controlar o DB

public class Boleto {
    // Colocar os itens irão ser utilizados na tela Boleto/Novo

    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Bando de dados cuida dos Ids
    @Id // Id da persistencia de dados

    private String descricao;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataVencimento;

    @NumberFormat(pattern = "#,##0.00") //formatação do numero dois números apos a virgula 
    private double valor;
     
    private Status status;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}