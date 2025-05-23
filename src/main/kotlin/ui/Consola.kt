package es.prog2425.calculadora.ui

import java.util.*

class Consola : IEntradaSalida {
    private val scanner = Scanner(System.`in`)

    override fun pedirNumero(mensaje: String): Double {
        var salir = false
        var numero = 0.0

        while (!salir) {
            println(mensaje)
            val input = scanner.nextLine()
            try {
                numero = input.toDouble()
                salir = true
            } catch (e: NumberFormatException) {
                mostrar("Error al ingresar el número, intente de nuevo.")
            }
        }
        return numero
    }

    override fun pedirOperador(): Char {
        mostrar("Introduce el operador (+, -, *, /):")
        val input = scanner.nextLine()
        if (input.length == 1 && input[0] in "+-*/") {
            return input[0]
        }
        mostrar("Operador no válido. Intente de nuevo.")
        return pedirOperador()
    }

    override fun mostrarResultado(resultado: String) {
        mostrar("Resultado: $resultado")
    }

    override fun preguntarOtraOperacion(): Boolean {
        mostrar("¿Desea realizar otro cálculo? (s/n):")
        return scanner.nextLine().lowercase() == "s"
    }

    override fun mostrar(msj: String) {
        println(msj)
    }
}