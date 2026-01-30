package com.example.mi_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mi_api.exception.ProductoNoEncontradoException;
import com.example.mi_api.model.Producto;
import com.example.mi_api.repository.ProductoRepository;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }
    
    public List<Producto> obtenerTodos(){
        return productoRepository.findAll();
    }

    //Esto es porque JPA retorna Optional
    // solo esto retorna Optional porque puede que el registro no exista
    public Producto obtenerPorId(String id){
        //orElseTrhow es un metodo de lo que retorna jpa - osea metodo de Optional que dice, si hay valor retornalo si no lanza una excepcion
        return productoRepository.findById(id)
                .orElseThrow(()-> new ProductoNoEncontradoException("producto no encontrado"));
    }

    // save() de JPA sirve para CREAR y ACTUALIZAR
    // Si el objeto NO tiene id → crea nuevo (INSERT)
    // Si el objeto tiene id existente → actualiza (UPDATE)
    public void guardar(Producto producto){
        productoRepository.save(producto);
    }

    public void eliminarPorId(String id){
        productoRepository.deleteById(id);
    }

    // ¿Por qué no hacer solo productoRepository.save(producto)?
    // Porque si el id no existe, JPA crea uno nuevo en vez de dar error
    // El usuario pensaría que actualizó pero realmente creó otro
    // Por eso primero verificamos que existe
    public void actualizar(String id, Producto producto){
        // 1. Verificar que existe, si no → excepción 404
        Producto existe = productoRepository.findById(id)
            .orElseThrow(()-> new ProductoNoEncontradoException("No existe"));

        // 2. Actualizar los campos del existente
        existe.setNombre(producto.getNombre());
        existe.setPrecio(producto.getPrecio());
        existe.setStock(producto.getStock());

        // 3. Guardar el EXISTENTE (no el producto nuevo)
        // Debe ser "existe" porque es el que tiene el id correcto y los datos actualizados
        productoRepository.save(existe);
    }

}
