// src/main/java/com/presentacion/princi/service/PagoServiceImpl.java
package com.presentacion.principal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.presentacion.principal.model.Pago;
import com.presentacion.principal.repository.PagoRepository;

import java.util.List;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    @Override
    public void registrarPago(Pago pago) {
        pagoRepository.save(pago);
    }

    @Override
    public List<Pago> listarPagosPorArriendo(Long arriendoId) {
        return pagoRepository.findByArriendoId(arriendoId);
    }
}
