// src/main/java/com/presentacion/princi/proxy/InmuebleServiceProxy.java
package com.presentacion.principal.proxy;

import com.presentacion.principal.service.InmuebleService;
import com.presentacion.principal.model.Inmueble;

import java.util.List;

public class InmuebleServiceProxy implements InmuebleService {

    private InmuebleService inmuebleService;

    public InmuebleServiceProxy(InmuebleService inmuebleService) {
        this.inmuebleService = inmuebleService;
    }

    @Override
    public void registrarInmueble(Inmueble inmueble) {
        // Añadir lógica adicional aquí (por ejemplo, validación)
        inmuebleService.registrarInmueble(inmueble);
    }

    @Override
    public void actualizarInmueble(Inmueble inmueble) {
        // Añadir lógica adicional aquí (por ejemplo, logging)
        inmuebleService.actualizarInmueble(inmueble);
    }

    @Override
    public void asignarInmueble(Long inmuebleId, Long usuarioId) {
        // Añadir lógica adicional aquí (por ejemplo, caching)
        inmuebleService.asignarInmueble(inmuebleId, usuarioId);
    }

    @Override
    public List<Inmueble> listarInmuebles() {
        return inmuebleService.listarInmuebles();
    }
}
