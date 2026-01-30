package com.example.mi_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mi_api.model.Producto;

//<Producto, :entidad que maneja, String es el tipo de id porque manejo String>
public interface ProductoRepository extends JpaRepository<Producto, String>{
    //no escribir ni un metodo, todo lo da jpa
}

