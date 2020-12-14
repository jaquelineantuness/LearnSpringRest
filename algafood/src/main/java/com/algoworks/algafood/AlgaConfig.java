package com.algoworks.algafood;

import com.algoworks.algafood.notificacao.NotificacaoEmail;
import com.algoworks.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgaConfig {

    @Bean
    public NotificacaoEmail notificacaoEmail(){
        NotificacaoEmail notificador = new NotificacaoEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }
    
    @Bean
    public AtivacaoClienteService ativacaoClienteService(){
        return  new AtivacaoClienteService(notificacaoEmail());//já tras um bean gerenciado pelo spring quando chamo notificacaoEmail()
    }
}
