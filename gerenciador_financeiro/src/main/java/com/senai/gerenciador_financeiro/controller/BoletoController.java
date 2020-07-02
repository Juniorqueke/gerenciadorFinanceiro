package com.senai.gerenciador_financeiro.controller;

import java.util.Arrays;
import java.util.List;

import com.senai.gerenciador_financeiro.model.Boleto;
import com.senai.gerenciador_financeiro.repository.Boletos;
import com.senai.gerenciador_financeiro.model.StatusBoleto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/boletos")
public class BoletoController {

    @Autowired //auto injetar os dados do spring
    private Boletos boletos;

     @RequestMapping("/novo")
    public ModelAndView novo(){
        ModelAndView mv = new ModelAndView("CadastrodeBoleto");
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    //define a pasta /boletos e o método de requisição para POST
    // quando faz isso os campos que vem do form entram tudo na classe boleto
    public ModelAndView salvar(Boleto boleto){
        boletos.save(boleto); //chama a interface e passa os dados do boleto
        ModelAndView mv = new ModelAndView ("CadastrodeBoleto");
        mv.addObject("mensagem", "Boleto salvo com sucesso!!");
        return mv;
    }

    @ModelAttribute("todosStatusBoleto")
    public List<StatusBoleto> todosStatusBoleto() {
        return Arrays.asList(StatusBoleto.values());
    }

    @RequestMapping
    public String pesquisar(){
        return "PesquisaBoleto";
    }



    
}