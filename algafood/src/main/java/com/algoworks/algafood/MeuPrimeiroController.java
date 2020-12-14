package com.algoworks.algafood;

import com.algoworks.algafood.modelo.Cliente;
import com.algoworks.algafood.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller e como fosse add o @component tbm
@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.println("MeuPrimeiroController" +ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Cliente joao = new Cliente("João", "joao@joao.com", "1654354654684");

        ativacaoClienteService.ativar(joao);

        return "Hello !";

    }

}
