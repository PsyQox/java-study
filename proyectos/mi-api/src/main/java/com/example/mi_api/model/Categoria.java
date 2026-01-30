package com.example.mi_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// RELACIÓN: Una categoría tiene MUCHOS productos (1:N)
// @ManyToOne solo está en Producto (el lado que tiene la FK en BD)
// Opcionalmente se puede agregar @OneToMany aquí para acceder a los productos desde categoría:
//   @OneToMany(mappedBy = "categoria")
//   private List<Producto> productos;
// Sin @OneToMany: Producto puede acceder a su categoría, pero no al revés
// Con @OneToMany: Ambos lados pueden acceder al otro
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nombre;

    public Categoria(){

    }

    public Categoria(String nombre){
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
