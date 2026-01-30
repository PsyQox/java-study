package com.example.mi_api.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//@Entity = esta clase representa una tabla en la base de datos
// JPA creara una tabla producto automaticamente
@Entity
public class Producto {
    //@Id - clave primaria
    //@GeneratedValue = el id se genera automaticamente (autoincrement)
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @NotBlank
    private String nombre;
    @NotNull
    private BigDecimal precio;
    @NotNull
    private Integer stock;
    @ManyToOne
    private Categoria categoria;

    public Producto(){

    }

    public Producto(String nombre, BigDecimal precio, Integer stock, Categoria categoria){
        //en la industruia es mas comun porque las validaciones se dejan en las anotaciones @NotBlank
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        //igual funciona si hay validaciones
        // setNombre(nombre);
        // setPrecio(precio);
        // setStock(stock);
    }

    //getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }
    
    public Integer getStock() {
        return stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    //settters
    //no lo necesita
    // public void setId(String id) {
    //     this.id = id;
    // }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
