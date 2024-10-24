// src/main/java/com/presentacion/princi/service/InmuebleService.java
package com.presentacion.principal.service;

import com.presentacion.principal.model.Inmueble;
import java.util.List;

public interface InmuebleService {
    void registrarInmueble(Inmueble inmueble);
    void actualizarInmueble(Inmueble inmueble);
    void asignarInmueble(Long inmuebleId, Long usuarioId);
    List<Inmueble> listarInmuebles();
}
