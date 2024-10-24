// src/main/java/com/presentacion/princi/proxy/UsuarioServiceProxy.java
package com.presentacion.principal.proxy;

import com.presentacion.principal.service.UsuarioService;
import com.presentacion.principal.model.Usuario;  // Importar la clase Usuario

public class UsuarioServiceProxy implements UsuarioService {

    private UsuarioService usuarioService;

    public UsuarioServiceProxy(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        // Añadir lógica adicional aquí (por ejemplo, validación)
        usuarioService.registrarUsuario(usuario);
    }

    @Override
    public Usuario autenticarUsuario(String email, String password) {
        // Añadir lógica adicional aquí (por ejemplo, logging)
        return usuarioService.autenticarUsuario(email, password);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        // Añadir lógica adicional aquí (por ejemplo, caching)
        usuarioService.modificarUsuario(usuario);
    }
}
