package com.algoworks.algafood.notificacao;

import com.algoworks.algafood.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
