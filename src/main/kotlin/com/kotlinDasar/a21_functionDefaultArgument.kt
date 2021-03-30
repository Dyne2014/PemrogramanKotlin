package com.kotlinDasar

fun main(){
    sayHello2("ade","sh")
    sayHello2("syahri", null)
    sayHello2("aaa")
}
// defaultnya parameter itu adalah kalau nggak diisi maka data defaultlah yg diambil
fun sayHello2(firstname : String, lastname : String? = ""){
    println("$firstname $lastname")
}