package com.algoworks.algafood.service;


import com.algoworks.algafood.modelo.Cliente;
import com.algoworks.algafood.notificacao.NotificacaoEmail;
import com.algoworks.algafood.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService"+ notificador);
    }

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente,"Seu cadastro no sistema está ativo");
    }
}
