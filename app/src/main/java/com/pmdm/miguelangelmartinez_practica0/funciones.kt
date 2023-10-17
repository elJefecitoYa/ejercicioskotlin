package com.pmdm.miguelangelmartinez_practica0


fun main() {

    // primerEjemplo()

    // varNumericas()

    varAlfaNum()

    var myBool:Boolean = varLog(true)
    myBool = varLog()
}


fun varLog(input: Boolean = false): Boolean {
    // Lógicas
    var trueOrFalse:Boolean = true
    val trueAlways = true
    val falseAlways = false
    trueOrFalse = !input
    return trueOrFalse
}

fun varAlfaNum() {
    //Variables alfa-numéricas
    // Char
    val myCharDeEjemploSuperExplicativo:Char = 'U'

    // String
    var cadena:String = "Hola a tod@s"
    println(cadena)
    println(cadena.uppercase())
}



fun varNumericas() {
    // Variables numéricas
    // Int
    val age:Int = 37
    var size:Int = 200
    println(age)
    print("Suma: ")
    println(age+size)
    println("Suma2: " + age + size)
    var pruebaLoca:Int = (age.toString() + size.toString()).toInt()
    println("Resta: " + (age-size))
    var multi = age*size
    println("Multiplicación: $multi")
    var div:Double = (size.toDouble()/age)
    println("\"División\": $size/$age = $div")
    println("\"Resto\": $size%$age = " + (size%age))

    // Long
    val algo:Long = 12478219480
    println(algo)
    //Float
    val flo:Float = 14.254f
    println(flo)

    // Double
    val superNumero:Double = 9223372036854775808.0 //9223372036854776000.0
    val superNumero2:Double = 91223372036854775808.0 //9223372036854780000.0
    println(superNumero2)
}