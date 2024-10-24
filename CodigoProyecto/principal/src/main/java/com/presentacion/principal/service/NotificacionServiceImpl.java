// src/main/java/com/presentacion/princi/service/NotificacionServiceImpl.java
package com.presentacion.principal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.presentacion.principal.model.Notificacion;
import com.presentacion.principal.repository.NotificacionRepository;

import java.util.List;

@Service
public class NotificacionServiceImpl implements NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepository;

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        notificacionRepository.save(notificacion);
    }

    @Override
    public List<Notificacion> listarNotificaciones() {
        return notificacionRepository.findAll();
    }
}
