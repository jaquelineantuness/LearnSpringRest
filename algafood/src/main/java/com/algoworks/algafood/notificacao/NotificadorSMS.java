package com.algoworks.algafood.notificacao;


import com.algoworks.algafood.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("urgente")
@Component
public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Noficando %s através do SMS do telefone %s : %s\n"
                , cliente.getNome()
                , cliente.getTelefone()
                , mensagem);
    }


}
