package com.kotlinDasar

infix fun String.ke(type: String): String{
    return if(type == "UP"){
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}

fun main(){
    val result = "Syahrif" ke "UP"
    println(result)
    println(100 downTo 2)
}