package com.pmdm.miguelangelmartinez_practica0.com.pmdm.miguelangelmartinez_practica0

fun main(){
    //inmutableList()
    mutableList()
}

fun mutableList() {
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(weekDays)
    // AÑADE AL FINAL
    weekDays.add("Daviday")
    // INSERTA EN LA POSICIÓN INDICADA
    weekDays.add(3,"Daviday")
    println(weekDays)

    weekDays.removeAt(0)
    // MEJOR USAR LA FUNCIÓN isNotEmpty()
    if(weekDays.isEmpty()){

    } else {
        weekDays.forEach(){println(it)}
    }

    weekDays.remove("Martes")
    if(weekDays.isNotEmpty()){
        weekDays.forEach(){println(it)}
    }

    weekDays.removeAll(listOf("Sábado", "Domingo"))
    println(weekDays)
    weekDays.clear()
    println(weekDays)
}

fun inmutableList(){
    var readOnly:List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[3])
    println(readOnly.first())
    println(readOnly.last())
    val example = readOnly.filter{ it.contains("á") }
    println("Ejemplo con acento: $example")
    val example2 = readOnly.filter{ it.contains("p", true) }
    println("Ejemplo con case: $example2")
    val example3 = readOnly.filter{ it.contains("x") }
    println("Ejemplo con resultado vacío: ${example3.isEmpty()}")
    println("Ejemplo con resultado vacío: $example2")

    readOnly.forEach{println(it)}
    readOnly.forEach{day -> println(day)} //equivalente al anterior, más legible


    // Probamos la inmutabilidad
//    readOnly.add("Dilluns") // NO SE PUEDE
//    readOnly.insert("Dilluns") // NO SE PUEDE
    // readOnly[0] = "Dilluns" // NO SE PUEDE
}