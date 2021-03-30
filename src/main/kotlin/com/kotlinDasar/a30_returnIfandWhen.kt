package com.kotlinDasar

fun main(){
    // return if
//    fun sayHello(name: String = ""): String {
//        return if (name == "") {
//            "Hello Brow"
//        } else {
//            "Hello $name"
//        }
//    }

    // return when
    fun sayHello(name: String = ""): String {
        return when (name) {
            "" -> "Hello Brow"
            else -> "Hello $name"
        }
    }
    println(sayHello())
    println(sayHello("Syah"))
}