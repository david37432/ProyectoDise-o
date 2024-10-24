// src/main/java/com/presentacion/princi/repository/UsuarioRepository.java
package com.presentacion.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.presentacion.principal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmailAndPassword(String email, String password);
}
