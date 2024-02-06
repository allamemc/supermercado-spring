package com.example.supermercadodawonline.repositorios;

import com.example.supermercadodawonline.model.jpa.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDetalle extends JpaRepository<Detalle, Integer> {
}
