# Programación Orientada a Objetos (POO)

## ¿Qué es POO?

**Programación Orientada a Objetos** es un paradigma (forma de programar) que organiza el código alrededor de **objetos** en lugar de funciones sueltas.

## La idea central

Modelas tu programa como si fueran **cosas del mundo real**:

| Mundo real | Código |
|------------|--------|
| Un carro | Objeto |
| Características | Atributos (marca, color, velocidad) |
| Acciones | Métodos (acelerar, frenar, encender) |
| Tipo de carro | Clase (el plano/molde) |

## Conceptos básicos

| Concepto | Descripción | Ejemplo |
|----------|-------------|---------|
| **Clase** | Plantilla/molde para crear objetos | `class Carro` |
| **Objeto** | Instancia de una clase (existe en memoria) | `new Carro()` |
| **Atributos** | Variables que pertenecen al objeto | `color`, `marca` |
| **Métodos** | Funciones que pertenecen al objeto | `acelerar()`, `frenar()` |

## Los 4 pilares de POO

### 1. Encapsulamiento
Ocultar datos internos, exponer solo lo necesario.
- Atributos `private`
- Acceso controlado con getters/setters

### 2. Herencia
Una clase puede heredar atributos y métodos de otra.
```java
class Perro extends Animal
```

### 3. Polimorfismo
Un método puede comportarse diferente según el objeto.
```java
animal.hacerSonido() // perro ladra, gato maulla
```

### 4. Abstracción
Mostrar solo lo esencial, ocultar la complejidad interna.
```java
carro.acelerar() // Usas el método sin saber cómo funciona por dentro
```

## ¿Por qué usar POO?

### Sin POO (código espagueti):
- Variables sueltas por todos lados
- Funciones sin relación clara
- Difícil de mantener y escalar

### Con POO:
- Código organizado en bloques lógicos
- Fácil de entender (modela el mundo real)
- Reutilizable (herencia)
- Fácil de modificar sin romper todo

## Analogía: LEGO

POO es como LEGO:
- Cada pieza (objeto) tiene forma y función específica
- Puedes combinar piezas para construir cosas complejas
- Puedes reusar la misma pieza en diferentes construcciones
- Si una pieza se rompe, la cambias sin destruir todo

## Clase vs Objeto

```
Clase  = Plano de una casa (define cómo será)
Objeto = Casa construida (existe en memoria)

Puedes construir muchas casas con el mismo plano.
```

## Ejemplo básico

```java
// Clase (plantilla)
public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Métodos
    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

// Crear objetos (instancias)
Persona persona1 = new Persona();
persona1.nombre = "Juan";
persona1.saludar(); // "Hola, soy Juan"

Persona persona2 = new Persona();
persona2.nombre = "María";
persona2.saludar(); // "Hola, soy María"
```

## Compilar y ejecutar múltiples archivos

### Archivo único (sin dependencias)

```bash
java MiArchivo.java
```
Java 11+ permite ejecutar directamente sin compilar (modo single-file).

### Múltiples archivos (con dependencias entre clases)

Cuando tienes clases en archivos separados que se relacionan (ej: `Main.java` usa `Carro.java`), **debes compilar primero**:

```bash
# Paso 1: Compilar todos los archivos .java
javac *.java

# Paso 2: Ejecutar la clase principal (sin .java)
java Main
```

O en una sola línea:
```bash
javac *.java && java Main
```

### ¿Por qué?

| Comando | Qué hace |
|---------|----------|
| `java Main.java` | Modo single-file: solo compila ESE archivo, no ve otras clases |
| `javac *.java` | Compila TODOS los .java, genera archivos .class |
| `java Main` | Ejecuta la clase Main (busca Main.class) |

### Archivos generados

Después de compilar verás archivos `.class`:
```
Carro.java   → Carro.class   (bytecode compilado)
Main.java    → Main.class    (bytecode compilado)
```

Los `.class` son los que ejecuta la JVM. Puedes eliminarlos con:
```bash
rm *.class
```

### Alternativa: Todo en un archivo

Si no quieres compilar, puedes poner todas las clases en un solo archivo (solo UNA puede ser `public`):

```java
// Main.java
public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
    }
}

class Carro {  // Sin public
    String marca;
}
```

**Nota:** En proyectos reales, cada clase va en su propio archivo.
