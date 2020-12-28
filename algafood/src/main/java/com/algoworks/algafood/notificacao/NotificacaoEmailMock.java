package com.algoworks.algafood.notificacao;


import com.algoworks.algafood.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificacaoEmailMock implements Notificador {

    public NotificacaoEmailMock(){
        System.out.println("NotificadorEmail MoCK");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("MOCK:Noficando seria enviada para %s através do email %s : %s\n"
                , cliente.getNome()
                , cliente.getEmail()
                , mensagem);
    }


}
