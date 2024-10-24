// src/main/java/com/presentacion/princi/controller/PagoController.java
package com.presentacion.principal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.presentacion.principal.service.PagoService;
import com.presentacion.principal.model.Pago;

import java.util.List;

@Controller
@RequestMapping("/pagos")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("pago", new Pago());
        return "registroPago";
    }

    @PostMapping("/registrar")
    public String registrarPago(@ModelAttribute Pago pago, Model model) {
        pagoService.registrarPago(pago);
        model.addAttribute("mensaje", "Pago registrado exitosamente");
        return "registroPago";
    }

    @GetMapping("/historial")
    public String mostrarHistorialPagos(@RequestParam Long arriendoId, Model model) {
        List<Pago> pagos = pagoService.listarPagosPorArriendo(arriendoId);
        model.addAttribute("pagos", pagos);
        return "historialPagos";
    }
}
