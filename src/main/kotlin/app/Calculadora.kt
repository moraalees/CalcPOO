package es.prog2425.calculadora.app

import es.prog2425.calculadora.data.Operacion
import es.prog2425.calculadora.model.Resultado
import es.prog2425.calculadora.ui.IEntradaSalida

class Calculadora(
    private val consola: IEntradaSalida,
    private val calculo: Operacion
) {
    fun ejecutar() {
        do {
            val num1 = consola.pedirNumero("Introduce el primer número:")
            val operador = consola.pedirOperador()
            val num2 = consola.pedirNumero("Introduce el segundo número:")

            val resultado = try {
                val valor = when (operador) {
                    '+' -> calculo.sumar(num1, num2)
                    '-' -> calculo.restar(num1, num2)
                    '*' -> calculo.multiplicar(num1, num2)
                    '/' -> calculo.dividir(num1, num2)
                    else -> throw IllegalArgumentException("Operador no válido")
                }
                Resultado.Exito(valor)
            } catch (e: Exception) {
                Resultado.Error(e.message ?: "Error desconocido")
            }
            when (resultado) {
                is Resultado.Exito -> consola.mostrarResultado(resultado.valor.toString())
                is Resultado.Error -> consola.mostrarResultado("Error: ${resultado.mensaje}")
            }
        } while (consola.preguntarOtraOperacion())
    }
}