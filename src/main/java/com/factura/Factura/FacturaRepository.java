package com.factura.Factura;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

    // Factura save(Factura factura);

    void deleteById(int id);

    List<Factura> findAll();

    Object findById(int id);

    void deleteById(Long id);

}
