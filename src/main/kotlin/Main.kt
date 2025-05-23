package es.prog2425.calculadora

import es.prog2425.calculadora.app.Calculadora
import es.prog2425.calculadora.data.Calculo
import es.prog2425.calculadora.ui.Consola

fun main(){
    Calculadora(Consola(), Calculo()).ejecutar()
}