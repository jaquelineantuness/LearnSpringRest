package com.algoworks.algafood.algafood.service;


import com.algoworks.algafood.algafood.modelo.Cliente;
import com.algoworks.algafood.algafood.notificacao.NotificacaoEmail;

public class AtivacaoClienteService {

    private NotificacaoEmail notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente,"Seu cadastro no sistema está ativo");
    }
}
