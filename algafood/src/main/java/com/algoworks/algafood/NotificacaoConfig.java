package com.algoworks.algafood;

import com.algoworks.algafood.notificacao.NotificacaoEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {
    @Bean
    public NotificacaoEmail notificacaoEmail(){
        NotificacaoEmail notificador = new NotificacaoEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }
}
