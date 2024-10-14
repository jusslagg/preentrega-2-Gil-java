package com.factura.Factura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {
    @Autowired
    private FacturaService facturaService;

    // Crear una nueva factura
    @PostMapping
    public void crearFactura(@RequestParam String cliente, @RequestParam String videojuego, @RequestParam double total) {
        Factura factura = new Factura();
        factura.setCliente(cliente);
        factura.setVideojuego(videojuego);
        factura.setTotal(total);
        facturaService.agregarUna(factura);
    }

    // Obtener todas las facturas
    @GetMapping
    public List<Factura> obtenerFacturas() {
        return facturaService.obtenerFactura();
    }

    // Eliminar una factura por ID
    @DeleteMapping("/{id}")
    public void eliminarFactura(@PathVariable int id) {
        facturaService.eliminarFactura(id);
    }
}