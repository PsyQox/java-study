package com.example.mi_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.mi_api.model.Modelo;
import com.example.mi_api.service.ModeloService;

import jakarta.validation.Valid;

// ESTILO HACKERRANK vs TU ESTILO:
// Tu estilo: @GetMapping, @PostMapping, @RequestMapping("/ruta-base"), ResponseEntity
// HackerRank: @RequestMapping(value, method), @ResponseStatus, sin ruta base
@RestController
public class ModeloController {

    // INYECCIÓN ESTILO HACKERRANK: @Autowired directo en el campo
    // Nota: inyecta la INTERFAZ (ModeloService), no la implementación (ModeloServiceImpl)
    // Spring busca una clase con @Service que implemente esta interfaz y la inyecta
    //
    // Tu estilo sería:
    // private final ModeloService modeloService;
    // public ModeloController(ModeloService modeloService) { this.modeloService = modeloService; }
    @Autowired
    private ModeloService modeloService;

    // RUTAS ESTILO HACKERRANK: @RequestMapping(value, method)
    // Tu estilo sería: @GetMapping("/")
    // consumes = "application/json" restringe a solo recibir JSON
    // @ResponseStatus define el código HTTP (en vez de ResponseEntity)

    // Página de inicio
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "Modelo API Home";
    }

    // Crear modelo - retorna 201 Created
    // @ResponseStatus se pone ARRIBA del método (no en el return como ResponseEntity)
    // Limitación: siempre retorna 201, no puedes cambiar condicionalmente
    //
    // Tu estilo sería:
    // @PostMapping("/modelo")
    // public ResponseEntity<Void> crear(@Valid @RequestBody Modelo m) {
    //     modeloService.createModelo(m);
    //     return ResponseEntity.status(HttpStatus.CREATED).build();
    // }
    //consumes restringe el tipo de contenido que hacepta el metodo
    @RequestMapping(value = "/modelo", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createModelo(@RequestBody @Valid Modelo modelo) {
        modeloService.createModelo(modelo);
    }

    // Obtener todos los modelos
    // Tu estilo: @GetMapping("/modelo")
    @RequestMapping(value = "/modelo", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Modelo> getAllModelos() {
        return modeloService.getAllModelos();
    }

    // Obtener modelo por id
    // Tu estilo: @GetMapping("/modelo/{id}")
    @RequestMapping(value = "/modelo/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Modelo getModeloById(@PathVariable Long id) {
        return modeloService.getModeloById(id);
    }

    // Borrar modelo por id
    // Tu estilo: @DeleteMapping("/modelo/{id}")
    @RequestMapping(value = "/modelo/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteModeloById(@PathVariable Long id) {
        modeloService.deleteModeloById(id);
    }

    // Borrar todos los modelos
    @RequestMapping(value = "/erase", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAllModelos() {
        modeloService.deleteAllModelos();
    }

    // Comparar modelos - recibe ids por query params
    // Ejemplo: GET /modelo/compare?ids=1,2,3
    // @RequestParam List<Long> ids → Spring convierte "1,2,3" a [1, 2, 3] automáticamente
    //
    // Tu estilo sería:
    // @GetMapping("/modelo/compare")
    // public ResponseEntity<List<Modelo>> compare(@RequestParam List<Long> ids) {
    //     return ResponseEntity.ok(modeloService.getAllModelosForComparision(ids));
    // }
    @RequestMapping(value = "/modelo/compare", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Modelo> compareModelos(@RequestParam List<Long> ids) {
        return modeloService.getAllModelosForComparision(ids);
    }
}
