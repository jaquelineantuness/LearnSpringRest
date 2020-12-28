package com.algoworks.algafood.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Retention(RetentionPolicy.RUNTIME):especifica que vai durar o tempo de execução
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoNotificador {

    NivelUrgencia value();
}
