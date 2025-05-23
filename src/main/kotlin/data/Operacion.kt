package es.prog2425.calculadora.data

interface Operacion {
    fun sumar(num1: Double, num2: Double) : Double
    fun restar(num1: Double, num2: Double) : Double
    fun multiplicar(num1: Double, num2: Double) : Double
    fun dividir(num1: Double, num2: Double) : Double
}