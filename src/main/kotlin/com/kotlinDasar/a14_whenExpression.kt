package com.kotlinDasar

fun main(){
    var nilai = "A"
    when(nilai){
        "A" -> {
            println("amazing") }
        "B" -> {
            println("Noice")
        }
        "C" -> {
            println("Hehey Not Bad")
        }
        "D" -> {
            println("Ugh, it's bad")
        }
    }

    // when expression multiple Option
    when(nilai){
    // if nilai == A || nilai == B ..........
        "A", "B", "C" -> {
            println("Selamat anda lulus")}
        else -> println("maaf anda tidak lulus")
    }

    // when expression in
    nilai = "E"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai){
        in nilaiLulus -> println("Selamat Anda Lulus!!!!")
        !in nilaiLulus -> println("Maaf, Anda tidak lulus!!!!")
    }

    // when expression is
    val name = "ade"
    when(name){
        is String -> println("name is string")
        !is String -> println("name is not string")
    }

    // when sebagai pengganti if else
    // cukup dengan mengosongkan parameter pada when
    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("hebatt")
        nilaiUjian > 80 -> println("baguss")
        nilaiUjian > 70 -> println("lumayan lah")
        else -> println("kamu gagall")
    }
}