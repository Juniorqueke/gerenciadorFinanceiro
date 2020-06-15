package com.senai.gerenciadorfinanceiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoletoController {

    @RequestMapping ("/boletos/novo")
    public String novo() {
        return "CadastrodeBoleto";
    }
    
}