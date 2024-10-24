// src/main/java/com/presentacion/princi/service/UsuarioServiceImpl.java
package com.presentacion.principal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.presentacion.principal.model.Usuario;
import com.presentacion.principal.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario autenticarUsuario(String email, String password) {
        return usuarioRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
