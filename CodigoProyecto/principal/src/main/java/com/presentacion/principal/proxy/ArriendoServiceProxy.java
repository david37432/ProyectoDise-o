// src/main/java/com/presentacion/princi/proxy/ArriendoServiceProxy.java
package com.presentacion.principal.proxy;

import com.presentacion.principal.service.ArriendoService;
import com.presentacion.principal.model.Arriendo;

import java.util.List;

public class ArriendoServiceProxy implements ArriendoService {

    private ArriendoService arriendoService;

    public ArriendoServiceProxy(ArriendoService arriendoService) {
        this.arriendoService = arriendoService;
    }

    @Override
    public void registrarArriendo(Arriendo arriendo) {
        // Añadir lógica adicional aquí (por ejemplo, validación)
        arriendoService.registrarArriendo(arriendo);
    }

    @Override
    public void actualizarArriendo(Arriendo arriendo) {
        // Añadir lógica adicional aquí (por ejemplo, logging)
        arriendoService.actualizarArriendo(arriendo);
    }

    @Override
    public void cancelarArriendo(Long id) {
        // Añadir lógica adicional aquí (por ejemplo, caching)
        arriendoService.cancelarArriendo(id);
    }

    @Override
    public List<Arriendo> listarArriendos() {
        return arriendoService.listarArriendos();
    }
}
