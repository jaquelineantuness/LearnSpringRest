package com.algoworks.algafood.notificacao;


import com.algoworks.algafood.modelo.Cliente;


public class NotificacaoEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificacaoEmail(String hostServidorSmtp){
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("NotificadorEmail chamado");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        if(this.caixaAlta){
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Noficando %s através do email %s usando SMTP %s: %s\n"
                , cliente.getNome()
                , cliente.getEmail()
                ,this.hostServidorSmtp
                , mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
