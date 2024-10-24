// src/main/java/com/presentacion/princi/proxy/NotificacionServiceProxy.java
package com.presentacion.principal.proxy;

import com.presentacion.principal.service.NotificacionService;
import com.presentacion.principal.model.Notificacion;

import java.util.List;

public class NotificacionServiceProxy implements NotificacionService {

    private NotificacionService notificacionService;

    public NotificacionServiceProxy(NotificacionService notificacionService) {
        this.notificacionService = notificacionService;
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        // Añadir lógica adicional aquí (por ejemplo, validación)
        notificacionService.enviarNotificacion(notificacion);
    }

    @Override
    public List<Notificacion> listarNotificaciones() {
        return notificacionService.listarNotificaciones();
    }
}
