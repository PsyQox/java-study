package com.example.mi_api.service;

import java.util.List;

import com.example.mi_api.model.Modelo;

// Interface: solo define el contrato (qué métodos existen)
// La implementación (cómo funcionan) va en ModeloServiceImpl
// @Override es buena práctica al implementar porque:
// - Sin @Override: si te equivocas en el nombre, Java crea un método NUEVO sin error
// - Con @Override: Java te avisa que el método no existe en la interfaz (error de compilación)
public interface ModeloService {
    void deleteAllModelos();
    void deleteModeloById(Long id);
    void createModelo(Modelo modelo);
    Modelo getModeloById(Long id);
    List<Modelo> getAllModelos();
    List<Modelo> getAllModelosForComparision(List<Long> ids);
}
