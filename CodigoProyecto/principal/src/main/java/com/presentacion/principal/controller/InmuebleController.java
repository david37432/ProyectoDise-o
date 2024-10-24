// src/main/java/com/presentacion/princi/controller/InmuebleController.java
package com.presentacion.principal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.presentacion.principal.service.InmuebleService;
import com.presentacion.principal.model.Inmueble;

import java.util.List;

@Controller
@RequestMapping("/inmuebles")
public class InmuebleController {

    @Autowired
    private InmuebleService inmuebleService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("inmueble", new Inmueble());
        return "registroInmueble";
    }

    @PostMapping("/registrar")
    public String registrarInmueble(@ModelAttribute Inmueble inmueble, Model model) {
        inmuebleService.registrarInmueble(inmueble);
        model.addAttribute("mensaje", "Inmueble registrado exitosamente");
        return "registroInmueble";
    }

    @GetMapping("/actualizacion")
    public String mostrarFormularioActualizacion(Model model) {
        model.addAttribute("inmueble", new Inmueble());
        return "actualizarInmueble";
    }

    @PostMapping("/actualizar")
    public String actualizarInmueble(@ModelAttribute Inmueble inmueble, Model model) {
        inmuebleService.actualizarInmueble(inmueble);
        model.addAttribute("mensaje", "Inmueble actualizado exitosamente");
        return "actualizarInmueble";
    }

    @GetMapping("/asignacion")
    public String mostrarFormularioAsignacion(Model model) {
        model.addAttribute("inmueble", new Inmueble());
        return "asignarInmueble";
    }

    @PostMapping("/asignar")
    public String asignarInmueble(@RequestParam Long inmuebleId, @RequestParam Long usuarioId, Model model) {
        inmuebleService.asignarInmueble(inmuebleId, usuarioId);
        model.addAttribute("mensaje", "Inmueble asignado exitosamente");
        return "asignarInmueble";
    }

    @GetMapping("/listar")
    public String listarInmuebles(Model model) {
        List<Inmueble> inmuebles = inmuebleService.listarInmuebles();
        model.addAttribute("inmuebles", inmuebles);
        return "listarInmuebles";
    }
}
