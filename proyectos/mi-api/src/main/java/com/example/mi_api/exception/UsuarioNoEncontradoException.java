package com.example.mi_api.exception;

public class UsuarioNoEncontradoException extends RuntimeException {
    public UsuarioNoEncontradoException(String message){
        super(message);
    }
}
