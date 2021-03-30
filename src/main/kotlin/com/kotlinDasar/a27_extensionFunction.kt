package com.kotlinDasar

fun String.hello(): String = "Hello $this"
fun String.printHello(): Unit = println("Hello $this")

fun main(){
    val name = "Syahrif"
    println(name.hello())
    name.printHello()
    "SyahrifulH".printHello()
}