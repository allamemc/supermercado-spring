package com.example.supermercadodawonline.repositorios;

import com.example.supermercadodawonline.model.jpa.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto, Integer> {
    @Query(value="select max(p.idproducto) from Producto p")
    public int maxId();
}
