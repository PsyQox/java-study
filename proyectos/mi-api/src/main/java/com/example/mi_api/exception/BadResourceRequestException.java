package com.example.mi_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// ESTILO HACKERRANK: @ResponseStatus directo en la excepción
// No necesita @ControllerAdvice ni @ExceptionHandler
// Spring ve esta anotación y retorna ese código HTTP automáticamente
//
// Diferencia con tu estilo:
// Tu estilo → excepción simple + @ControllerAdvice centralizado (más flexible)
// HackerRank → @ResponseStatus en la excepción (más rápido, menos código)
//
// @ResponseStatus(HttpStatus.BAD_REQUEST) = siempre retorna 400
// No puedes cambiar el status condicionalmente (esa es la limitación)
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadResourceRequestException extends RuntimeException {

    public BadResourceRequestException(String message) {
        super(message);
    }
}
