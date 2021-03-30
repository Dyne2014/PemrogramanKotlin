package com.kotlinDasar

// ciri dari recursive = didalam blok functionnya ia memanggil dirinya sendiri
// fungsi rekursif
fun factorialRecursive(value: Int): Int{
    return when(value){
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}
fun main(){
    // fungsi dng looping biasa
    fun factorialLoop(value: Int): Int{
        var result = 1
        for (i in value downTo 1){
            result *= i
        }
        return result
    }
    println(factorialLoop(10))
    println(factorialRecursive(10))
    // println(factorialRecursive(100000)) // akan error stackoverflow karena recursivenya terlalu dalam
}