package com.kotlinDasar

// closure = kemampuan function, lambda, anonymous fun berinteraksi dgn data data sekitar dlm scope yg sama
// penggunaan closure jika salah digunakan bisa berbahaya, sebisa mungkin hindari penggunaan ini

fun main(){
    var counter: Int = 0

    val lambdaIncrement = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun(){
        println("anonymous fun increment")
        counter++
    }

    fun functionIncrement(){
        println("Function increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    println(counter)
}