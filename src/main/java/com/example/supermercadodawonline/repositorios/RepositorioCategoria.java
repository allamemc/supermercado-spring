package com.example.supermercadodawonline.repositorios;


import com.example.supermercadodawonline.model.jpa.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCategoria extends JpaRepository<Categoria, Integer> {

}
