# ¿Qué es Kotlin?

Kotlin es un lenguaje de programación para desarrollo de aplicaciones multiplataforma.

CARACTERISTICAS

1. Kotlin es un lenguaje tipado.
2. Es null safety -> es una barrera contra los null pointer exception
3. Corre sobre la Java Virtual Machine
4. 100% interoperable con Java
5. Es un lenguaje de programación Funcional
6. Es fácil de aprender


Kotlin trae nuevas características como la inmutabilidad. Cuando declaramos variables, puede ser que cambiemos los datos o no lo hagamos.

Google decició tomar a Kotlin como lenguaje de primera mano para desarrollar apps en Android.

- La curva de aprendizaje de Kotlin es muy pequeña.
- Kotlin se puede utilizar en varias plataformas.

Los archivos en Kotlin, tiene la extensión **`.kt`**

## Instalando y probando Kotlin en Windows

Debemos descargar los archivos de Kotlin desde la página oficial. [Kotlin Compiler Standalone](https://kotlinlang.org/docs/tutorials/command-line.html)

- `set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_144`


- `set PATH=%PATH%C:\Program Files\Java\jdk1.8.0_144\bin`

O podemos descargar Java desde la página oficial [Descargar Java](https://www.java.com/es/download/)


**Configurando Kotlin**

Ahora debemos configurar los binarios que hemos descargado de Kotlin. Para ello debemos colocar los archivos en un lugar donde lo lo vayamos a borrar y luego copiar la ruta y usar ese PATH para hacerlo disponible.

- `set PATH=%PATH%;C:\Program Files\kotlinc\bin`
- `set PATH=%PATH%;C:\Program Files\kotlin-native-windows-1.3.61\bin`

Con el siguiente comando comprobamos si ya esta funcionando kotlin
- `kotlinc-jvm`
- `2+2`
- `:quit`


Creamos un archivo nuevo y donde coloquemos un hola mundo. Para ello creamos un archivo *`hello.kt`*

```kotlin
fun main(args:Array<String>){
  print("Hola Kotlin!)
}
```

Seguidamente ejecutamos el archivo, debemos agregarle la ruta y un argumento al compilador para poder ejecutar el runtime de JVM

- `kotlinc ruta_archivo\hello.kt -include-runtime -d archivo_salida/hello.jar`

Para ejecutarlo, usamos java

- `java -jar hello.jar`


## Instalando y probando IntelliJ IDEA

IntelliJ IDEA es un IDE, un entorno de programación equipado para trabajar con Kotlin.

Para descargar IntelliJ IDEA debemos ir a [IntelliJ IDEA](https://www.jetbrains.com/idea/)



## Variables y tipos en Kotlin

En este modulo vamos a aprender la sintaxis básica de Kotlin, declaración de variables, estructuras de control.

- Usando la palabra reservada **`val`** las variables son **inmutables**, es decir que _no pueden ser modificadas_ a lo largo del programa.

- Usando la palabra reservada **`var`** las variables son **mutables**, es decir que puedes _modificar su valor_ a lo largo del programa.


```kotlin
fun main(args: Array<String>) {
  
  val a = 5 // Inmutable (NO se puede cambiar)
  var b = 4 // Mutable

  val nombre:String = "Juan Perez"


  val num:Int = 0
  val lgn:Long = 23L
  val lng2 = 22L
  val flt = 4f
  val flt2:Float 4f
  val doub:Double = 23.9

  val isCool = false
  val isTerco:Boolean = false

}
```

Los Strings en Kotlin tiene muchas ventajas sobre otros lenguajes.

## String templates

Los Strings nos permiten almacenar cadenas de texto.
En Kotlin para concatenar cadenas de texto usamos templates, estos templates nos permiten hacer que la concatenación sea mas fácil de leer. En este caso las variables las podemos insertar directamente en el String usando el símbolo `$`.

En los Strings también podemos hacer operaciones usando brackets `{ }` después del símbolo `$`



## Kotlin para Android

Android Studio por defecto coloca Kotlin para que vayamos migrando a este nuevo lenguaje.

Kotlin es mas sencillo para programar aplicaciones en Android. 

- Los import son las API para poder reutilizar funcionalidades

_Las clases son la definición de los objetos_

La herencia en Kotlin, se usa con `:` dos puntos.

```kotlin
package com.example.kotlinstarted

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
```

Override, sobrecarga la función que se hereda de la clase Actividad.
El signo de interrogación **?** en Kotlin evita los errores de puntero vacio (NullPointerException). Super, es una palabra clave que permite utilizar los métodos heredados de la clase padre.

> En Kotlin no se usa **`;`**

Las **data class** son útiles cuando queremos utilizar las clases como POJO's.

```kotlin
// Clase Implicita de datos
data class Cursos(val nombre: String, val url:String)
```

La concatenación en Kotlin se hace con **`${variable}`**

```kotlin
mensaje.text = "Curso de ${react.nombre} en platzi.com/${react.url}"
```

En caso de que aparezca error como _You've successfully authenticated, but GitHub does not provide shell access._ usar la siguiente sentencia.

- `git remote set-url origin git@github.com:jocode/KotlinStarted.git`

