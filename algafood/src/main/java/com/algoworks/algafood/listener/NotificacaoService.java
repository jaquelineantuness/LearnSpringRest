package com.algoworks.algafood.listener;

import ch.qos.logback.core.joran.spi.ConsoleTarget;
import com.algoworks.algafood.notificacao.NivelUrgencia;
import com.algoworks.algafood.notificacao.Notificador;
import com.algoworks.algafood.notificacao.TipoDoNotificador;
import com.algoworks.algafood.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {
    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void ClienteAtivadoListentener(ClienteAtivadoEvent event){
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo");
    }
}
