package com.algoworks.algafood.notificacao;


import com.algoworks.algafood.modelo.Cliente;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificacaoEmail implements Notificador {
    //pode colocar qualquer nome para usar a propriedade custom
    @Value("${notificador.email.host-servidor}")
    private String host;
    @Value("${notificador.email.porta-servidor}")
    private Integer porta;


    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.println("Host: "+host);
        System.out.println("Porta: " + porta);

        System.out.printf("Noficando %s através do email %s : %s\n"
                , cliente.getNome()
                , cliente.getEmail()
                , mensagem);
    }


}
