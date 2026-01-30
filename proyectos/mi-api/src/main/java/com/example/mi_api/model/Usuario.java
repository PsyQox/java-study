package com.example.mi_api.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// VALIDACIONES A NIVEL DE MODEL: formato/estructura de datos
// Solo miran el dato, no necesitan consultar nada más
// Se activan con @Valid en el controller
public class Usuario {
    //No puede ser null
    @NotNull(message = "El id es requerido")
    private Long id;
    //No puede ser null, estar vacio, ni solo espacios
    @NotBlank(message = "El nombre es requerido")
    private String nombre;
    //formato de email valido y validacion de requerido
    @NotBlank(message = "Email requerido")
    @Email(message = "Formato correcto")
    private String email;

    public Usuario(){

    }

    public Usuario(Long id, String nombre, String email){
        setId(id);
        setNombre(nombre);
        setEmail(email);
    }
    //getters
    public Long getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEmail(){
        return email;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
