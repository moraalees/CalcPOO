package es.prog2425.calculadora.model

sealed class Resultado {
    data class Exito(val valor: Double): Resultado()
    data class Error(val mensaje: String): Resultado()
}