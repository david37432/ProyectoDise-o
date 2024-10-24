// src/main/java/com/presentacion/princi/controller/UsuarioController.java
package com.presentacion.principal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;  // Importar la anotación Controller
import org.springframework.ui.Model;  // Importar la clase Model
import org.springframework.web.bind.annotation.*;
import com.presentacion.principal.service.UsuarioService;
import com.presentacion.principal.model.Usuario;

import java.util.Map;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registrar")
    public String registrarUsuario(@ModelAttribute Usuario usuario, Model model) {
        usuarioService.registrarUsuario(usuario);
        model.addAttribute("mensaje", "Usuario registrado exitosamente");
        return "registro";
    }

    @GetMapping("/autenticacion")
    public String mostrarFormularioAutenticacion(Model model) {
        model.addAttribute("credenciales", new Usuario());
        return "autenticacion";
    }

    @PostMapping("/autenticar")
    public String autenticarUsuario(@RequestParam String email, @RequestParam String password, Model model) {
        Usuario usuario = usuarioService.autenticarUsuario(email, password);
        if (usuario != null) {
            model.addAttribute("mensaje", "Autenticación exitosa");
        } else {
            model.addAttribute("mensaje", "Credenciales incorrectas");
        }
        return "autenticacion";
    }

    @GetMapping("/modificacion")
    public String mostrarFormularioModificacion(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "modificar";
    }

    @PostMapping("/modificar")
    public String modificarUsuario(@ModelAttribute Usuario usuario, Model model) {
        usuarioService.modificarUsuario(usuario);
        model.addAttribute("mensaje", "Usuario modificado exitosamente");
        return "modificar";
    }
}
