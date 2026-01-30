package com.example.mi_api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mi_api.exception.BadResourceRequestException;
import com.example.mi_api.exception.NoSuchResourceFoundException;
import com.example.mi_api.model.Modelo;
import com.example.mi_api.repository.ModelRepository;

// @Service("modeloService") = le da un nombre al bean para que Spring lo identifique
// implements ModeloService = cumple el contrato de la interfaz
// @Autowired = Spring inyecta la dependencia directamente en el campo (sin constructor)
@Service("modeloService")
public class ModeloServiceImpl implements ModeloService {
    @Autowired
    private ModelRepository modelRepository;

    // Crear modelo - lanza excepción si el id ya existe
    // Usa isPresent() porque verificamos si SÍ existe (al revés de orElseThrow)
    @Override
    public void createModelo(Modelo modelo){
        Optional<Modelo> existente = modelRepository.findById(modelo.getId());
        // isPresent() = ¿tiene valor? (true = ya existe)
        if (existente.isPresent()) {
            throw new BadResourceRequestException("Modelo con ese id ya existe");
        }
        modelRepository.save(modelo);
    }

    // Buscar por id - lanza excepción si NO existe
    // Usa isEmpty() en vez de orElseThrow() (estilo HackerRank)
    // isEmpty() es lo contrario de isPresent()
    @Override
    public Modelo getModeloById(Long id){
        Optional<Modelo> modelo = modelRepository.findById(id);
        // isEmpty() = ¿está vacío? (true = no existe)
        if (modelo.isEmpty()) {
            throw new NoSuchResourceFoundException("Modelo no encontrado");
        }
        // .get() = obtener el valor del Optional
        return modelo.get();
    }

    // Obtener todos los modelos
    @Override
    public List<Modelo> getAllModelos(){
        return modelRepository.findAll();
    }

    // Borrar todos los modelos de un solo golpe
    // deleteAllInBatch() es más eficiente que deleteAll()
    // deleteAll() borra uno por uno, deleteAllInBatch() hace un solo DELETE SQL
    @Override
    public void deleteAllModelos(){
        modelRepository.deleteAllInBatch();
    }

    // Borrar por id
    @Override
    public void deleteModeloById(Long id){
        modelRepository.deleteById(id);
    }

    // Comparar modelos: mínimo 2, máximo 4
    // Valida cantidad de ids y que todos existan en la BD
    @Override
    public List<Modelo> getAllModelosForComparision(List<Long> ids){
        // Validación 1: mínimo 2 ids
        if (ids == null || ids.size() < 2) {
            throw new BadResourceRequestException("Se necesitan al menos 2 ids para comparar");
        }

        // Validación 2: máximo 4 ids
        if (ids.size() > 4) {
            throw new BadResourceRequestException("Máximo 4 productos para comparar");
        }

        // Buscar cada modelo por id
        List<Modelo> modelos = new ArrayList<>();
        for (Long id : ids) {
            Optional<Modelo> modelo = modelRepository.findById(id);
            if (modelo.isPresent()) {
                modelos.add(modelo.get());
            }
        }

        // Validación 3: todos los ids deben existir
        if (modelos.size() != ids.size()) {
            throw new NoSuchResourceFoundException(
                "Uno o más modelos no encontrados. Pedidos: " + ids.size() +
                ", Encontrados: " + modelos.size()
            );
        }

        return modelos;
    }
}
