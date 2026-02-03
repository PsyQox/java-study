package com.example.mi_api.model;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
//jsonInclude quiere decir que campos que tengan el valor de null no seran agregados al JSON
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Modelo implements Serializable{
    @Id
    private Long id;
    private String name;
    private String imageURL;
    @Column(length = 1000)
    private String description;
    private Double price;
    private Double rating;
    //Ademas se  usa trancient porque Map no se puede guardar directamente en la db, para guardarlo es otra tabla con @ElementCollection mas complejo y convertirlo a JSON string ccon  @Convert
    @ElementCollection
    // @Transient //No se guarda en la base de datos solamente existe en memoria

    //Se usa porque las especificaciones no son staticas, por ej: una laptop tiene ram, memoria, pero una camisa tiene talla, color, como es dinamico no puedes hacer un atributo fijo para cada uno Map es como List y HashMap es como ArrayList
    private Map<String, String> specifications;

    public Modelo(){

    }

    public Modelo(Long id, String name, String imageURL, String description, Double price, Double rating, Map<String, String> specifications){
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.specifications = specifications;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Double getRating() {
        return rating;
    }

    public Map<String, String> getSpecifications() {
        return specifications;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setSpecifications(Map<String, String> specifications) {
        this.specifications = specifications;
    }

}
