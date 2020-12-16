package com.algoworks.algafood.service;


import com.algoworks.algafood.modelo.Cliente;
import com.algoworks.algafood.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    //@Autowired para demonstrar qual contrutor o Spring irá usar ao instanciar.(quando existe apenas 1 construtor não é necessário)
    @Autowired
    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

    }

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente,"Seu cadastro no sistema está ativo");
    }

    //@Autowired é o ponto de injeção
//    @Autowired
//    public void setNotificador(Notificador notificador) {
//        this.notificador = notificador;
//    }
}
