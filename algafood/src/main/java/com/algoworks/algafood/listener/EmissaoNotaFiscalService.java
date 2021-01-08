package com.algoworks.algafood.listener;

import com.algoworks.algafood.notificacao.NivelUrgencia;
import com.algoworks.algafood.notificacao.Notificador;
import com.algoworks.algafood.notificacao.TipoDoNotificador;
import com.algoworks.algafood.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void ClienteAtivadoListentener(ClienteAtivadoEvent event){
        System.out.println("Emitindo nota Fiscal para cliente "+ event.getCliente().getNome());
    }
}
