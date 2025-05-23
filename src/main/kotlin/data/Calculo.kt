package es.prog2425.calculadora.data

class Calculo : Operacion {
    override fun sumar(num1: Double, num2: Double) = num1 + num2

    override fun restar(num1: Double, num2: Double) = num1 - num2

    override fun multiplicar(num1: Double, num2: Double) = num1 * num2

    override fun dividir(num1: Double, num2: Double): Double {
        if (num2 == 0.0){
            throw IllegalArgumentException("No se puede dividir por cero.")
        }
        return num1 / num2
    }
}