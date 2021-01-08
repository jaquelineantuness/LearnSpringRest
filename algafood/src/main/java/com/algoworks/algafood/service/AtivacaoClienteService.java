package com.algoworks.algafood.service;


import com.algoworks.algafood.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService{

    @Autowired
    private ApplicationEventPublisher eventPublisher;


    public void ativar(Cliente cliente){
        cliente.ativar();

        // dizer para o container que o cliente está ativo nesse momento
        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

    }

}
