// src/main/java/com/presentacion/princi/controller/ArriendoController.java
package com.presentacion.principal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.presentacion.principal.service.ArriendoService;
import com.presentacion.principal.model.Arriendo;

import java.util.List;

@Controller
@RequestMapping("/arriendos")
public class ArriendoController {

    @Autowired
    private ArriendoService arriendoService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("arriendo", new Arriendo());
        return "registroArriendo";
    }

    @PostMapping("/registrar")
    public String registrarArriendo(@ModelAttribute Arriendo arriendo, Model model) {
        arriendoService.registrarArriendo(arriendo);
        model.addAttribute("mensaje", "Arriendo registrado exitosamente");
        return "registroArriendo";
    }

    @GetMapping("/actualizacion")
    public String mostrarFormularioActualizacion(Model model) {
        model.addAttribute("arriendo", new Arriendo());
        return "actualizarArriendo";
    }

    @PostMapping("/actualizar")
    public String actualizarArriendo(@ModelAttribute Arriendo arriendo, Model model) {
        arriendoService.actualizarArriendo(arriendo);
        model.addAttribute("mensaje", "Arriendo actualizado exitosamente");
        return "actualizarArriendo";
    }

    @GetMapping("/cancelacion")
    public String mostrarFormularioCancelacion(Model model) {
        model.addAttribute("arriendo", new Arriendo());
        return "cancelarArriendo";
    }

    @PostMapping("/cancelar")
    public String cancelarArriendo(@RequestParam Long id, Model model) {
        arriendoService.cancelarArriendo(id);
        model.addAttribute("mensaje", "Arriendo cancelado exitosamente");
        return "cancelarArriendo";
    }

    @GetMapping("/listar")
    public String listarArriendos(Model model) {
        List<Arriendo> arriendos = arriendoService.listarArriendos();
        model.addAttribute("arriendos", arriendos);
        return "listarArriendos";
    }
}
