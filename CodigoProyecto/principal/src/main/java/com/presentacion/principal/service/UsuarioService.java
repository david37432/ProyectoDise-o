// src/main/java/com/presentacion/princi/service/UsuarioService.java
package com.presentacion.principal.service;
import com.presentacion.principal.model.Usuario;  // Importar la clase Usuario

public interface UsuarioService {
    void registrarUsuario(Usuario usuario);
    Usuario autenticarUsuario(String email, String password);
    void modificarUsuario(Usuario usuario);
}
