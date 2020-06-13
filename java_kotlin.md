# Migración de Java a Kotlin

Kotlin es un lenaguaje que busca a ayudarnos a tener una curva de aprendizaje corta y rápida.
Ventajas de Kotlin sobre Java.

## Kotlin - Java

- Funciona sobre la JVM (Java Virtual Machine)
- Compilado a código de Javascript
- Basado en...
  - Java
  - Scala (Java Avanzado)
  - Groovy (Manejo de paquetes y proyectos grandes)
  - C#
- Android (Desarrollo Nativo)
  - C++
  - Java
  - Kotlin
- Kotlin
  - Curva de aprendizaje corta
  - Menos líneas de código
  - Seguridad frente a nulos
    - `val x: Int = null` (No podemos asignar nulos si no lo indicamos)
    - `val x:Int? = null`
  - Interfaces pueden tener código
  - POJO reemplzado por _**clase dato**_

En [JetBrains](https://www.jetbrains.com/es-es/idea/download/) podemos descargar IntelliJ IDEA para poder utilizar este entorno para programar en JAVA o usar Kotlin

## Kotlin en Android

Kotlin aparece como una nueva apuesta dentro del desarrollo como un lenguaje moderno, rápido, flexible y, sobre todo, pensando en la productividad y conceptos sencillos. En el desarrollo de aplicaciones Android están cambiando las reglas y Kotlin es la base de las nuevas reglas que debemos de entender si es que nos interesa mantener los conocimientos actualizados a la velocidad de los últimos cambios. Kotlin no solamente es un nuevo lenguaje, es un cambio en la filosofía del desarrollo por las bases de su naturaleza y su funcionamiento. Kotlin es una gran apuesta para cualquier desarrollador de aplicaciones móviles.

En la opción de plugin podemos instalar **Kotlin** en Android Studio para poder usar el lenguaje para programar aplicaciones Android.

En Android podemos usar código combinado, usando Java y Kotlin

Para ello, es recomendado usar paquetes donde se especifique el el lenguaje utilizado.

- **javacode**
- **kotlincode**

Es buena idea no tener los lenguajes combinados en el mismo paquete.

## Convertir código de Java a Kotlin

Para usar kotlin con android Studio, en build.gradle se crean algunos plugins para dar soporte. En la Version de Android Studio

```
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'
```

## Elementos básicos en Android
