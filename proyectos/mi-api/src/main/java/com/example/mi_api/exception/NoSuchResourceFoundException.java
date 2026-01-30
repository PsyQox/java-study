package com.example.mi_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Mismo estilo que BadResourceRequestException
// @ResponseStatus(HttpStatus.NOT_FOUND) = siempre retorna 404
// Se lanza cuando un recurso no existe en la BD
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoSuchResourceFoundException extends RuntimeException {

    public NoSuchResourceFoundException(String message) {
        super(message);
    }
}
