// src/main/java/com/presentacion/princi/service/ArriendoServiceImpl.java
package com.presentacion.principal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.presentacion.principal.model.Arriendo;
import com.presentacion.principal.repository.ArriendoRepository;

import java.util.List;

@Service
public class ArriendoServiceImpl implements ArriendoService {

    @Autowired
    private ArriendoRepository arriendoRepository;

    @Override
    public void registrarArriendo(Arriendo arriendo) {
        arriendoRepository.save(arriendo);
    }

    @Override
    public void actualizarArriendo(Arriendo arriendo) {
        arriendoRepository.save(arriendo);
    }

    @Override
    public void cancelarArriendo(Long id) {
        arriendoRepository.deleteById(id);
    }

    @Override
    public List<Arriendo> listarArriendos() {
        return arriendoRepository.findAll();
    }
}
