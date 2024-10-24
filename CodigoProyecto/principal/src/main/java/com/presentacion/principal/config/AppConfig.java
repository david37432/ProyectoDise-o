// src/main/java/com/presentacion/princi/config/AppConfig.java
package com.presentacion.principal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.presentacion.principal.service.ArriendoService;
import com.presentacion.principal.service.ArriendoServiceImpl;
import com.presentacion.principal.service.InmuebleService;
import com.presentacion.principal.service.InmuebleServiceImpl;
import com.presentacion.principal.service.NotificacionService;
import com.presentacion.principal.service.NotificacionServiceImpl;
import com.presentacion.principal.service.PagoService;
import com.presentacion.principal.service.PagoServiceImpl;
import com.presentacion.principal.service.UsuarioService;
import com.presentacion.principal.service.UsuarioServiceImpl;
import com.presentacion.principal.proxy.ArriendoServiceProxy;
import com.presentacion.principal.proxy.InmuebleServiceProxy;
import com.presentacion.principal.proxy.NotificacionServiceProxy;
import com.presentacion.principal.proxy.PagoServiceProxy;
import com.presentacion.principal.proxy.UsuarioServiceProxy;

@Configuration
public class AppConfig {

    @Bean
    public UsuarioService usuarioService() {
        UsuarioServiceImpl usuarioServiceImpl = new UsuarioServiceImpl();
        return new UsuarioServiceProxy(usuarioServiceImpl);
    }
     @Bean
    public ArriendoService arriendoService() {
        ArriendoServiceImpl arriendoServiceImpl = new ArriendoServiceImpl();
        return new ArriendoServiceProxy(arriendoServiceImpl);
    }
    @Bean
    public PagoService pagoService() {
        PagoServiceImpl pagoServiceImpl = new PagoServiceImpl();
        return new PagoServiceProxy(pagoServiceImpl);
    }
    @Bean
    public NotificacionService notificacionService() {
        NotificacionServiceImpl notificacionServiceImpl = new NotificacionServiceImpl();
        return new NotificacionServiceProxy(notificacionServiceImpl);
    }
    @Bean
    public InmuebleService inmuebleService() {
        InmuebleServiceImpl inmuebleServiceImpl = new InmuebleServiceImpl();
        return new InmuebleServiceProxy(inmuebleServiceImpl);
    }
}
