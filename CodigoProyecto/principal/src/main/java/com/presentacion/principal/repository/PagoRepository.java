// src/main/java/com/presentacion/princi/repository/PagoRepository.java
package com.presentacion.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.presentacion.principal.model.Pago;

import java.util.List;

public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByArriendoId(Long arriendoId);
}
