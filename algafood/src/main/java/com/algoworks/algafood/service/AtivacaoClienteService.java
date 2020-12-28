package com.algoworks.algafood.service;


import com.algoworks.algafood.modelo.Cliente;
import com.algoworks.algafood.notificacao.NivelUrgencia;
import com.algoworks.algafood.notificacao.Notificador;
import com.algoworks.algafood.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();


        notificador.notificar(cliente,"Seu cadastro no sistema está ativo");


    }

}
