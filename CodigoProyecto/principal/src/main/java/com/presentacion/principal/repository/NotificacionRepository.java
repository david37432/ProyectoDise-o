// src/main/java/com/presentacion/princi/repository/NotificacionRepository.java
package com.presentacion.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.presentacion.principal.model.Notificacion;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
}
