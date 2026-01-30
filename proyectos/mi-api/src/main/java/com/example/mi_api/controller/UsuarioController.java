package com.example.mi_api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mi_api.model.Usuario;
import com.example.mi_api.service.UsuarioService;

import jakarta.validation.Valid;

@RestController
//ruta base
@RequestMapping("/usuarios")
//las anotaciones de los metodos se suman 

public class UsuarioController {
    private final UsuarioService usuarioService;

    //servicio inyectado
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    //rutas metodos
    // usa la ruta base usuarios
    //get que obtiene todos los usuarios
    @GetMapping()
    public List<Usuario> obtenerTodos(){
        return usuarioService.obtenerTodos();
    }

    @GetMapping("/{id}")
    //@PathVariable = params (en la URL)
    // para query strings utilizas @RequestParam
    //multiple params (@PathVariable long id, PathVariable Long id2)
    //multiple query (@RequestParam String nombre, @RequestParam int edad)
    public ResponseEntity<Usuario> obtenerPorId(@PathVariable Long id){
        Usuario usuario = usuarioService.obtenerPorId(id);
        //404 Se necita build para finalizar en otros casos el body completa la respuesta, casos sin body si lo necesita
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    @PostMapping()
    public ResponseEntity<Usuario> crear(@Valid @RequestBody Usuario usuario){
        usuarioService.crear(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @DeleteMapping("/{id}")
    //los genericos no aceptan primitvos solo objetos por eso Void
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        usuarioService.eliminar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    //para put
    //@PutMapping("/{id}")
    //public void actualizar(@PathVariable id, @RequestBody Usuaruio usuario)
    @PutMapping("/{id}")
    public ResponseEntity<Void> actualizar(@PathVariable Long id, @Valid @RequestBody Usuario usuario){
        usuarioService.actualizar(id, usuario);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
