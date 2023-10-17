package com.pmdm.miguelangelmartinez_practica0
//Miguel Angel Martínez Berlanga
fun main() {

    var name:String = "David"
    var name2:String? = "null" // ? String nulable

    //name = dameunstring()
    name2 = dameunstring()

    if(name == "David"){
        println("ENTRA1")
    }

//    if(name2!![0] == 'D'){ // !! Seguro que no es null
//        println("ENTRA2")
//    }

    if(name2?.get(0) == 'D'){ // ? Si no es nulo, dame el valor
        println("ENTRA3")
    }

    var aux = name2?.get(0) ?: println("Es nulo") // ? Si no es nulo, dame el valor
    if(aux == 'D')
        println("ENTRA4")
}
fun dameunstring(): String? {
    if(false) return null
    else return "Dola"
}
