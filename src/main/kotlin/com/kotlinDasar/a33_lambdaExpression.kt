package com.kotlinDasar
// tidak perlu keyword return pada lambda
// pakai it jika lambda hanya punya 1 parameter
fun toUpper(value: String): String = value.toUpperCase()

fun main(){
    // lambda expression
    val contohLambda:(String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    // it
    val contohLambda2:(String) -> String = {
        "Halo $it"
    }

    // Method References
    // adalah bikin lambda expression tapi dari referensi function yg sudah ada
    val toUpperCase:(String) -> String = ::toUpper

    val result = contohLambda("Syahrif","h")
    println(result)
    println(contohLambda2("Ifull"))
    println(toUpperCase("adesH"))
}