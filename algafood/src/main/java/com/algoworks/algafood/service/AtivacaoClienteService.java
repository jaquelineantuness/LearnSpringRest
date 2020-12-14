package com.algoworks.algafood.service;


import com.algoworks.algafood.modelo.Cliente;
import com.algoworks.algafood.notificacao.NotificacaoEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private NotificacaoEmail notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente,"Seu cadastro no sistema está ativo");
    }
}
