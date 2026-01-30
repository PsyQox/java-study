package com.example.mi_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// @ControllerAdvice = intercepta excepciones de TODOS los controllers
// Spring lo instancia automáticamente (como @Service, @Repository)
// Es como el middleware de errores en Express: app.use((err, req, res, next) => {})
@ControllerAdvice
public class GlobalExceptionHandler{

    // @ExceptionHandler(Tipo.class) = "cuando se lance este TIPO de excepción, usa este método"
    // .class = referencia al tipo/clase (como typeof en JS)
    // El parámetro (EmailDuplicadoException e) recibe la excepción lanzada para acceder a su mensaje
    @ExceptionHandler(EmailDuplicadoException.class)
    public ResponseEntity<String> handleEmailDuplicado(EmailDuplicadoException e){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage()); // 409
    }

    // Exception.class = captura CUALQUIER excepción no manejada arriba
    // Siempre ponerlo al final como "catch-all"
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneral(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno del servidor"); // 500
    }

    @ExceptionHandler(UsuarioNoEncontradoException.class)
    public ResponseEntity<String> handleUsuarioNoEncontrado(UsuarioNoEncontradoException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage()); //404
    }

    @ExceptionHandler(ProductoNoEncontradoException.class)
    public ResponseEntity<String> handleProductoNoEncontrado(ProductoNoEncontradoException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}
