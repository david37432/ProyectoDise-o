// src/main/java/com/presentacion/princi/service/NotificacionService.java
package com.presentacion.principal.service;

import com.presentacion.principal.model.Notificacion;
import java.util.List;

public interface NotificacionService {
    void enviarNotificacion(Notificacion notificacion);
    List<Notificacion> listarNotificaciones();
}
