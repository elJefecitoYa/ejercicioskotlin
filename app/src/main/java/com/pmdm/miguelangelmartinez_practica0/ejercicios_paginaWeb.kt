package com.pmdm.miguelangelmartinez_practica0
//Miguel Angel Martínez Berlanga
fun main() {

    //ejercicio 2
//    val morningNotification = 100
//    val eveningNotification = 99
//
//    mensajes(morningNotification)
//    mensajes(eveningNotification)

//ejercico 3
//    val child = 5
//    val adult = 28
//    val senior = 87
//
//    val isMonday = true
//
//    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
//    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, false)}.")
//    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")







}



//función del ejercicio 2
fun mensajes(numberOfMessages: Int) {
    if(numberOfMessages < 100){
        println("You have $numberOfMessages notifications.")

    }else{
    println("Your phone is blowing up! You have 99+ notifications.")
    }
}

//función del ejercicio 3
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    when (age){
        in 1 ..12-> return 15
        in 13..60-> if (isMonday == true){
            return 25
        }else{
            return 30
        }
       in 61 .. 100-> return 20

    else -> return -1
    }
}



