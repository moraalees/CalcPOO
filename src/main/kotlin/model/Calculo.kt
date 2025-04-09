package es.prog2425.calculadora.model

class Calculo : Operacion {
    override fun sumar(num1: Double, num2: Double) : Double {
        return num1 + num2
    }

    override fun restar(num1: Double, num2: Double) : Double {
        return num1 - num2
    }

    override fun multiplicar(num1: Double, num2: Double) : Double{
        return num1 * num2
    }

    override fun dividir(num1: Double, num2: Double) : Double{
        return num1 / num2
    }
}