package com.pmdm.miguelangelmartinez_practica0.com.pmdm.miguelangelmartinez_practica0

fun main(){
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(weekDays.size) // = 7
    println(weekDays.indices) // = [0, 1, 2, 3, 4, 5, 6]

    //Arrays
    for(i in weekDays.indices) { // SOLO DEVUELVE ÍNDICE
        println(i) // Muestra la posición
        println(weekDays[i]) // Muestra el valor de la posición i
    }

    for((i,value) in weekDays.withIndex()){ // DEVUELVE ÍNDICE y VALOR
        println("La posición $i contiene $value") // Muestra la posición "i" y el valor "value"
    }

    for(day in weekDays) // SOLO DEVUELVE VALOR
        println(day)

    // "Classic" for
    for(i in 0 .. weekDays.size-1)
        println(i)
    for(i in 0 .. weekDays.size-1 step 2)
        println(i)
    for(i in weekDays.size-1 downTo 0 step 2)
        println(i)
}