package com.kotlinDasar

// blok terakhir lambda akan menjadi return value, kata kunci "return" tidak disupport oleh lambda
// lambda cocok utk menyelesaikan masalah sederhana, namun utk kasus kompleks
// kita bisa memakai anonymous function
fun main(){
    fun hello(name: String, transform: (String)->String): String{
        val nameTransform = transform(name)
        return "Halo $nameTransform"
    }

    val upper = fun (value: String): String{
        return if (value == ""){
            "OOps"
        }else{
            value.toUpperCase()
        }
    }

    println(hello("Syahrifh", upper))
    println(hello("",upper))

    // atau bisa langsung memasukkan anonymous functionnya menjadi parameter seperti
    println(hello("", fun(value: String): String{
        return value.toLowerCase()
    }))
}