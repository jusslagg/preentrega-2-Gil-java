package com.factura.Factura;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@NoArgsConstructor
@Table(name = "FACTURA")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "PRECIO")
    private int precio;

    @ManyToOne(fetch = FetchType.LAZY)
    private Persona persona;

    public void setCliente(String cliente) {
        throw new UnsupportedOperationException("Unimplemented method 'setCliente'");
    }

    public void setVideojuego(String videojuego) {
        throw new UnsupportedOperationException("Unimplemented method 'setVideojuego'");
    }

    public void setTotal(double total) {
        throw new UnsupportedOperationException("Unimplemented method 'setTotal'");
    }

}
