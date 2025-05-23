package es.prog2425.calculadora.ui

interface IEntradaSalida {
    fun pedirNumero(mensaje: String): Double
    fun pedirOperador(): Char
    fun mostrarResultado(resultado: String)
    fun preguntarOtraOperacion(): Boolean
    fun mostrar(msj: String)
}