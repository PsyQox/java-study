package com.example.mi_api.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.mi_api.model.Usuario;

import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {
    //List es mas flexible que ArrayList como tipado, porque si el dia de mañana quieres cambiar ArrayList por linkedlist solamente cambias la clase de la que vas a instanciar el objeto pero no el tipo de dato. List es una interfaz
    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> findAll(){
        return usuarios;
    }

    public Usuario findById(Long id){
        
        for(Usuario usuario: usuarios){
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    public void save(Usuario u){
        usuarios.add(u);
    }

    public void deleteById(Long id){
        // mientras iteras no puedes modificar el valor
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }

    //preguntar por validaciones y manejo de errores

    public void update(Long id, Usuario usuario){
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId().equals(id)) {
                //reemplaza al usuario en esa posicion
                usuarios.set(i, usuario);
                return;
            }
        }
    }
}
