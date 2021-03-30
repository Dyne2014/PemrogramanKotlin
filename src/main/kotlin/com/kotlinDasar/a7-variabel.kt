package com.kotlinDasar
// variabel = tempat utk menyimpan data
// variable mutable(/bisa diubah) dengan " var ", yg immutable gunakan " val "
// direkomendasikan memakai immutable variable terlebih dahulu ( val )
const val APP = "Kotlin"
const val BELAJAR = "Belajar"
const val VERSION = 1.45

fun main(){

    val firstname = "Syahrif"
    val age = 20

    println(firstname)
    println(age)

    // scr standar variable harus diisi, bila null / none maka akan error
    val null1 : String? = null
    println(null1)
    // constant variable
    // constant = immutable data yg dapat diakses secara global, biasa ditandai dengan nama UPPERCASE
    println("$BELAJAR $APP : $VERSION")

}