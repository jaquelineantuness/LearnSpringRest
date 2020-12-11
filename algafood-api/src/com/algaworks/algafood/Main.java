package com.algaworks.algafood;

import com.algaworks.algafood.model.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;

public class Main {
    public  static void main(String[] args){

        Cliente joao = new Cliente("João", "email.joão@vc.com", "154346431");
        Cliente maria = new Cliente("Maria", "email.maria@vc.com", "524346431");

        Notificador notificador = new NotificacaoSMS();

        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);
    }
}
