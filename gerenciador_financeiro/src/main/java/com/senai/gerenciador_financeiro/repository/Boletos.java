package com.senai.gerenciador_financeiro.repository;

import com.senai.gerenciador_financeiro.model.Boleto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Boletos extends JpaRepository<Boleto, Long> {
    // para a classe JPA é preciso passar uma classe que tem o modelo
    // dos dados(Boleto.java)
    // tipo de dados de referência que é o Long(id ou código)

    // o próprio Spring já faz a implementação da interface pra nós,
    // por isso aqui não tem código nenhum.
    // o campo id lá no banco precisa estar como autoincrement verifica lá pra nós
    // só tá dando erro no formato da data, tem 12 campo data vencimento tira o
    // ultimo
    // como muda lá?!acho q eu está criando o campo automático perai q vou tentar
    // acha opnde ´´e

}