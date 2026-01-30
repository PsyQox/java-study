package com.example.mi_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mi_api.exception.EmailDuplicadoException;
import com.example.mi_api.exception.UsuarioNoEncontradoException;
import com.example.mi_api.model.Usuario;
import com.example.mi_api.repository.UsuarioRepository;

@Service
public class UsuarioService {
    //final es que solamente es asignado 1 vez
    private final UsuarioRepository usuarioRepository;

    //spring inyecta el repositorio automaticamente aqui
    //es mejor esto que instanciar uno porque a nivel de runtime es mejor la inyeccion de spring porque solamente hace una vez la instancia de repo y todos apuntarian al mismo objeto en vez de tener separados, esto es buena practica ademas para testing es bueno
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    //metodos

    public List<Usuario> obtenerTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario obtenerPorId(Long id){
        Usuario usuario = usuarioRepository.findById(id);
        if (usuario == null) {
            throw new UsuarioNoEncontradoException("Usuario no encontrado");
        }
        return usuario;
    }

    // VALIDACIONES A NIVEL DE SERVICE: lógica de negocio
    // Necesitan consultar el repositorio o dependen de otros datos
    // Ej: email duplicado, usuario tiene permisos, límites
    public void crear(Usuario u){
        // Validación manual: verificar si el email ya existe
        for(Usuario usuario: usuarioRepository.findAll()){
            if (usuario.getEmail().equals(u.getEmail())) {
                throw new EmailDuplicadoException("El email ya esta registrado");
            }
        }
        usuarioRepository.save(u);
    }

    public void eliminar(Long id){
        usuarioRepository.deleteById(id);
    }

    public void actualizar(Long id, Usuario user){
        usuarioRepository.update(id, user);
    }
}
