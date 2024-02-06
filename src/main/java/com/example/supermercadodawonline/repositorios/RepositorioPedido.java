package com.example.supermercadodawonline.repositorios;

import com.example.supermercadodawonline.model.jpa.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPedido extends JpaRepository<Pedido, Integer> {
    @Query("SELECT MAX(p.idpedido)+1 FROM Pedido p")
    public Integer nextIdPedido();
}
