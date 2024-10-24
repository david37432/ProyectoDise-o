// src/main/java/com/presentacion/princi/repository/ArriendoRepository.java
package com.presentacion.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.presentacion.principal.model.Arriendo;

public interface ArriendoRepository extends JpaRepository<Arriendo, Long> {
}
