// src/main/java/com/presentacion/princi/controller/NotificacionController.java
package com.presentacion.principal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.presentacion.principal.service.NotificacionService;
import com.presentacion.principal.model.Notificacion;

import java.util.List;

@Controller
@RequestMapping("/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService notificacionService;

    @GetMapping("/visualizar")
    public String listarNotificaciones(Model model) {
        List<Notificacion> notificaciones = notificacionService.listarNotificaciones();
        model.addAttribute("notificaciones", notificaciones);
        return "listarNotificaciones";
    }

    @GetMapping("/enviar")
    public String mostrarFormularioEnvio(Model model) {
        model.addAttribute("notificacion", new Notificacion());
        return "enviarNotificacion";
    }

    @PostMapping("/enviar")
    public String enviarNotificacion(@ModelAttribute Notificacion notificacion, Model model) {
        notificacionService.enviarNotificacion(notificacion);
        model.addAttribute("mensaje", "Notificación enviada exitosamente");
        return "enviarNotificacion";
    }
}
