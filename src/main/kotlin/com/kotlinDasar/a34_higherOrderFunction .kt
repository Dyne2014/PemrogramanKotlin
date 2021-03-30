package com.kotlinDasar

// function yg menggunakan function sbg parameter / return function
// jikalau function hanya punya 1 parameter maka bisa dipanggil oleh "it"
fun main(){
    fun hello(name: String, transform: (String)->String): String{
        val nameTransform = transform(name)
        return "Halo $nameTransform"
    }
    // cara ke 1 memanggilnya
    val lambdaUp = {value: String -> value.toUpperCase()}

    println(hello("ade",lambdaUp))
    // cara ke 2 yg lebih simpel
    println(hello("Syah") { value: String -> value.toLowerCase() })
    // atau
    println(hello("Syah") { it.toLowerCase() })


    val result1 = hello("AdeSh1") { it: String ->
        it.toLowerCase()
    }
    // cara ke 3 " trailing lambda "
    val result2 = hello("AdesH2"){
        it.toLowerCase()
    }
    val result3 = hello("AdesH2"){ value: String ->
        value.toLowerCase()
    }
    println(result1)
    println(result2)
    println(result3)
    // namun trailing lambda hanya bisa dilakukan saat parameternya di posisi akhir
}