package com.kotlinDasar


fun menjumlah(a: Int, b:Int):Int{
    val total = a+b
    return total
}
fun bagi(a: Int, b:Int): Int {
    if(b == 0){
        return 0
    }
    else{
        val result = a / b
        return result
    }
}
// atau bisa disebut function yang mengembalikan data / nilai
fun main(){
    println(menjumlah(15,10))
    val result = menjumlah(100,100)
    println(result)
    println(bagi(6,2))
}