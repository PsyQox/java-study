package com.example.mi_api.exception;

// ¿Por qué extender RuntimeException?
// 1. RuntimeException = unchecked, no obliga try-catch (código más limpio)
// 2. Crear un TIPO nuevo para que @ExceptionHandler lo identifique
//    - El tipo (clase) es la identidad, el mensaje es solo el contenido
//    - @ExceptionHandler filtra por TIPO, no por mensaje
// 3. Permite dar respuestas HTTP diferentes según el tipo de error
public class EmailDuplicadoException extends RuntimeException{

    public EmailDuplicadoException(String message){
        // Pasa el mensaje a la clase padre (RuntimeException)
        // Luego se accede con e.getMessage() en el handler
        super(message);
    }
}
