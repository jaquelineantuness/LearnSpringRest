package com.algoworks.algafood.notificacao;


import com.algoworks.algafood.modelo.Cliente;
import org.springframework.stereotype.Component;

//@Component inicia o Bin, vai aparecer ao subir a aplicação
@Component
public class NotificacaoEmail {

    public NotificacaoEmail(){
        System.out.println("Construtor chamado");
    }

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Noficando %s através do email %s: %s\n"
                , cliente.getNome()
                , cliente.getEmail()
                , mensagem);
    }
}
