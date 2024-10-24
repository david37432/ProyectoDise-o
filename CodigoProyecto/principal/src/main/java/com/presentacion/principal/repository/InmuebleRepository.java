// src/main/java/com/presentacion/princi/repository/InmuebleRepository.java
package com.presentacion.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.presentacion.principal.model.Inmueble;

public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {
}
