// src/main/java/com/presentacion/princi/service/InmuebleServiceImpl.java
package com.presentacion.principal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.presentacion.principal.model.Inmueble;
import com.presentacion.principal.repository.InmuebleRepository;

import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService {

    @Autowired
    private InmuebleRepository inmuebleRepository;

    @Override
    public void registrarInmueble(Inmueble inmueble) {
        inmuebleRepository.save(inmueble);
    }

    @Override
    public void actualizarInmueble(Inmueble inmueble) {
        inmuebleRepository.save(inmueble);
    }

    @Override
    public void asignarInmueble(Long inmuebleId, Long usuarioId) {
        Inmueble inmueble = inmuebleRepository.findById(inmuebleId).orElseThrow(() -> new RuntimeException("Inmueble no encontrado"));
        inmueble.setUsuarioId(usuarioId);
        inmuebleRepository.save(inmueble);
    }

    @Override
    public List<Inmueble> listarInmuebles() {
        return inmuebleRepository.findAll();
    }
}
