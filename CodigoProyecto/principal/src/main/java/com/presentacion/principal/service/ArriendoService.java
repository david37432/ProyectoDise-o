// src/main/java/com/presentacion/princi/service/ArriendoService.java
package com.presentacion.principal.service;

import com.presentacion.principal.model.Arriendo;
import java.util.List;

public interface ArriendoService {
    void registrarArriendo(Arriendo arriendo);
    void actualizarArriendo(Arriendo arriendo);
    void cancelarArriendo(Long id);
    List<Arriendo> listarArriendos();
}
