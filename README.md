# Calculadora Básica POO + SOLID

---

## Descripción

Este proyecto es una calculadora que sigue, a lo que es mi parecer, principios de Programación Orientada a Objetos (POO) y respetando los principios SOLID.

Permite realizar operaciones básicas como suma, resta, multiplicación y división, solicitando entrada al usuario mediante la consola y manejando errores como por ejemplo la división entre 0. Al final de cada operación, el usuario puede decidir si desea realizar otro cálculo, reseteando los valores de la anterior operación y preguntando por la nueva.

---

## Estructura

He dividido este proyecto en diferentes directorios con el fin de representar de mejor forma los principios SOLID:
- [`Directorio App`](https://github.com/moraalees/CalcPOO/tree/main/src/main/kotlin/app): Directorio encargado de establecer la conexión entre el usuario y la consola.
    - [`Calculadora`](https://github.com/moraalees/CalcPOO/blob/main/src/main/kotlin/app/Calculadora.kt): Orquesta lo que viene a ser el flujo principal del programa, llamando a la consola para realizarle preguntas al humano.
- [`Directorio Data`](https://github.com/moraalees/CalcPOO/tree/main/src/main/kotlin/data): Directorio que se encarga de tener las clases que significan el manejo de datos.
    - [`Operacion`](https://github.com/moraalees/CalcPOO/blob/main/src/main/kotlin/data/Operacion.kt): Interfaz que define las operaciones matemáticas básicas.
    - [`Calculo`](https://github.com/moraalees/CalcPOO/blob/main/src/main/kotlin/data/Calculo.kt): Implementa correctamente los método de Operacion.
- [`Directorio Model`](https://github.com/moraalees/CalcPOO/tree/main/src/main/kotlin/model): Encargado de tener las clases de la lógica de negocio, es decir, sobre las que se va a tratar el programa.
    - [`Resultado`](https://github.com/moraalees/CalcPOO/blob/main/src/main/kotlin/model/Resultado.kt): Clase sellada que representa un resultado exitoso o un error.
- [`Directorio Ui`](https://github.com/moraalees/CalcPOO/tree/main/src/main/kotlin/ui): Contiene las clases que se van a comunicar con el usuario, pero no directamente en este directorio, si no más bien siendo implementadas en `App`.
    - [`IEntradaSalida`](https://github.com/moraalees/CalcPOO/blob/main/src/main/kotlin/ui/IEntradaSalida.kt): Interfaz de entrada / salida.
    - [`Consola`](https://github.com/moraalees/CalcPOO/blob/main/src/main/kotlin/ui/Consola.kt): Clase que implementa de `IEntradaSalida` y usa sus métodos correctamente.
- [`Main`](https://github.com/moraalees/CalcPOO/blob/main/src/main/kotlin/Main.kt): En una sola línea hace posible el funcionaminento correcto del programa.
