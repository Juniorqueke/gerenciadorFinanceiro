package com.senai.gerenciadorfinanceiro.repository;

import com.senai.gerenciadorfinanceiro.model.Boleto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Boletos extends JpaRepository<Boleto, Long> {
    // para a classe JPA é preciso passar uma classe que tem o modelo dos
    // dados(Boleto.java)
    // tipo de dados de referência que é o Long(id ou código)
    // o próprio Spring já faz a implementação da interface or isso aqui não tem
    // código nenhum

}