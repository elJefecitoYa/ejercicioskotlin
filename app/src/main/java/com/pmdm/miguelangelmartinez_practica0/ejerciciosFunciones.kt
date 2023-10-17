package com.pmdm.miguelangelmartinez_practica0

import kotlinx.coroutines.awaitAll


fun main(){
    val a = 3
    val b= 9

    funcion_entero(a,b)

    val x = 'Y'
    val y = "hola buenos días"
    funcion_alfanumerico()



    println("El resultado de la suma es: " + add(a,b))

    showAge2() // Llama a showAge2 sin argumentos, usará el valor por defecto (30)
    showAge2(25) // Llama a showAge2 con un argumento específico (25)


    var edad= readln().toDouble()
    println(edad)

    if (edad <18 )
    {
        println("Es menor")

    }else{
        print("Es mayor")
    }
}


fun funcion_entero(a: Int, b: Int){

    println("$a y $b")
}

fun funcion_alfanumerico(){
    val x = 'Y'
    val y = "hola buenos días"
    print("$x y $y")
}

fun add(a1: Int, b1:Int): Int {
    val suma = a1 + b1
    return suma


}

fun showAge2(age: Int = 30) {
    println("La edad es $age")
}

fun superFun(bariable:Any):/*when (bariable){ (no haría falta poner los returns)*/Any{
    when(bariable){
        is String -> return "Hola"
        is Int -> return 10
        else -> return "ERROR BOBI!!"

    }
}


fun otroWhen(nota:Int){

    when(nota){
        in 1  .. 4-> print("Suspendido")
        5 -> print("Suficiente")
        6 -> print("Bien")
        7 -> print("Notable")
        8 -> print("Notable alto")
        9 -> print("Excelente")
        10 ,11-> print("Perfecto")
        else -> print("Nota incorrecta")

    }

}
