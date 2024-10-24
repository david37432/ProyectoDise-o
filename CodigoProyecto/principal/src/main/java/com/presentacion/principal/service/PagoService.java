// src/main/java/com/presentacion/princi/service/PagoService.java
package com.presentacion.principal.service;

import com.presentacion.principal.model.Pago;
import java.util.List;

public interface PagoService {
    void registrarPago(Pago pago);
    List<Pago> listarPagosPorArriendo(Long arriendoId);
}
