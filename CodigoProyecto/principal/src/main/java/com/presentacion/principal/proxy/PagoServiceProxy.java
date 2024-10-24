// src/main/java/com/presentacion/princi/proxy/PagoServiceProxy.java
package com.presentacion.principal.proxy;

import com.presentacion.principal.service.PagoService;
import com.presentacion.principal.model.Pago;

import java.util.List;

public class PagoServiceProxy implements PagoService {

    private PagoService pagoService;

    public PagoServiceProxy(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @Override
    public void registrarPago(Pago pago) {
        // Añadir lógica adicional aquí (por ejemplo, validación)
        pagoService.registrarPago(pago);
    }

    @Override
    public List<Pago> listarPagosPorArriendo(Long arriendoId) {
        return pagoService.listarPagosPorArriendo(arriendoId);
    }
}
