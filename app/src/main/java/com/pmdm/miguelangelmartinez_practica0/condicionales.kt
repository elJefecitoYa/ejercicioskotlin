package com.pmdm.miguelangelmartinez_practica0.com.pmdm.miguelangelmartinez_practica0

fun main() {
    var nombre = "David"//readln()
    var resultado = if (nombre == "David") {
        "Hola David"
    } else {
        "Fuera intruso"
    }
    println(resultado)

    var holita = superFUn(false)
    println(holita)

}

fun superFUn(bariable: Any): Any {
    var resultado = when (bariable) {
        is String -> "Hola"
        is Int -> 10
        else -> "ERROR! $bariable"
    }
    return resultado
}

fun otroWhen(nota: Int) {
    val NOTA_0 = 0
    when (nota) {
        in Int.MIN_VALUE .. 4 -> println("Suspendido")
        5 -> println("Aprobado")
        6 -> println("Bien")
        7, 8 -> println("Notable")
        9 -> println("Sobresaliente")
        10 -> println("MH")
        else -> {
            var nota2 = nota+1
            println("Eso no es posible")
            println("Revisa la nota $nota2")
        }
    }
}