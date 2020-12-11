package com.algaworks.algafood.service;

import com.algaworks.algafood.model.Cliente;
import com.algaworks.algafood.notificacao.NotificacaoEmail;

public class AtivacaoClienteService {

    private NotificacaoEmail notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente,"Seu cadastro no sistema está ativo");
    }
}
