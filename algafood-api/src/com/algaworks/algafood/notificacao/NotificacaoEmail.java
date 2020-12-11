package com.algaworks.algafood.notificacao;

import com.algaworks.algafood.model.Cliente;

public class NotificacaoEmail {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Noficando %s através do email %s: %s\n"
                , cliente.getNome()
                , cliente.getEmail()
                , mensagem);
    }
}
