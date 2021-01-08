package com.algoworks.algafood.notificacao;


import com.algoworks.algafood.modelo.Cliente;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificacaoEmail implements Notificador {
    @Autowired
    private NotificadorProperties properties;

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.println("Host: "+properties.getHostServidor());
        System.out.println("Porta: " + properties.getPortaServidor());

        System.out.printf("Noficando %s através do email %s : %s\n"
                , cliente.getNome()
                , cliente.getEmail()
                , mensagem);
    }


}
