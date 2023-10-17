package com.pmdm.miguelangelmartinez_practica0

fun main(){

//    primerEjemplo()
//
//    //double
//
//    var supernumero:Double = 2334545555.43
//
//    //variables alfa-numericas
//    var CharSuper:Char = 'U'
//    //string
//    var cadena:String = "Hola a todos"
//    print(cadena)
//    cadena.uppercase()
//
//    //lógicas
//    var trueOrFalse:Boolean = true
//    val trueAlways = true
//    val flaseAlways = false

}

fun primerEjemplo(){
    //Cosas de prueba
    val age:Int = 37
    var size:Int = 200
    println(age)
    print("Suma:")
    println(age + size)
    println("suma 2: " + age + size)
    var  pruebaLoca:Int = (age.toString() + size.toString()).toInt()
    var multi = age*size
    println("Multiplicacion: $multi")
    var div = (size.toDouble()/age) // para que salga con decimales
    println("División: $size/$age = $div")
    println("\"Resto\": $size%$age =  " + (size%age))

}

