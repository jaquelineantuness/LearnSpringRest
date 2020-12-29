package com.algoworks.algafood.notificacao;


import com.algoworks.algafood.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificacaoEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Noficando %s através do email %s : %s\n"
                , cliente.getNome()
                , cliente.getEmail()
                , mensagem);
    }


}
