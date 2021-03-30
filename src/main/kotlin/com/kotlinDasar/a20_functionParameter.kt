package com.kotlinDasar

fun main(){
    sayHello("ade","sh")
    sayHello("syahri", null)
}
// deklarasi parameter dapat langsung dilakukan tanpa embel embel var / val
// ? adalah boleh null artinya data dapat diberi nilai null
fun sayHello(firstname : String, lastname : String?){
    when (lastname) {
        null -> println("Hallow $firstname (-1-)")
        else -> println("Hallow $firstname $lastname (-2-)")
    }
}