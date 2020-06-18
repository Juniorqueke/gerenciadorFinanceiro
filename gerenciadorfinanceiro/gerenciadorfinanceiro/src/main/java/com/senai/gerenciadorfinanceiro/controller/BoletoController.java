package com.senai.gerenciadorfinanceiro.controller;

import java.util.Arrays;
import java.util.List;

import com.senai.gerenciadorfinanceiro.model.Boleto;
import com.senai.gerenciadorfinanceiro.repository.Boletos;
import com.senai.gerenciadorfinanceiro.model.StatusBoleto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/boletos")
public class BoletoController {

    @Autowired // Auto injetar dados do Spring
    private Boletos boletos;

    @RequestMapping("/novo")
    public ModelAndView novo() {
        final ModelAndView mv = new ModelAndView("CadastrodeBoleto");
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    // Define o diretório /boletos e o método de requisição para POST
    // Quando faz isso os campos que vem do form HTML entram na classe Boleto
    public ModelAndView salvar(final Boleto boleto) {
        boletos.save(boleto); // Chama a interface e passa os dados do boleto
        final ModelAndView mv = new ModelAndView("CadastrodeBoleto");
        mv.addObject("mensagem", "Boleto salvo!");
        return mv;
    }
        @ModelAttribute("todosStatusBoleto")
        public List<StatusBoleto> todosStatusBoleto() {
            return Arrays.asList(StatusBoleto.values());
        }
}