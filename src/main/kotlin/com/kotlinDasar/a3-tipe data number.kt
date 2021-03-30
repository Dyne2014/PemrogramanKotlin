package com.kotlinDasar

fun main(){
    val age : Int = 20
    // float number
    val sample : Float = 13.24F  // memakai " F " agar kotlin mengenali bahwa nilai tsb float walaupun semisal
    // tipe " Float " Tidak dideklarasikan pada variabel yg menyimpan nilainya

    // literal
    val binary : Int = 0b011000

    // underscore = utk hanya mempermudah membaca angka
    val long : Long = 10_000_000L // memakai " L " agar kotlin mengenali bahwa nilai tsb Long walaupun semisal
    // tipe " Long " Tidak dideklarasikan pada variabel yg menyimpan nilainya

    // conversion
    val byte : Byte = 200.toByte()


    println(age)
    println(sample)
    println(binary)
    println(long)
    println(byte)
    println()
}