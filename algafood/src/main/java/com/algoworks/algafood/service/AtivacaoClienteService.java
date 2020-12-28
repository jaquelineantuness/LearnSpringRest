package com.algoworks.algafood.service;


import com.algoworks.algafood.modelo.Cliente;
import com.algoworks.algafood.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();


        notificador.notificar(cliente,"Seu cadastro no sistema está ativo");


    }

}
