package com.kotlinDasar

fun main(){
    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiEkstra = 70

    val isLulusUjian = nilaiUjian > 75
    val isLulusAbsen = nilaiAbsen > 75
    val isLulusEkstra = nilaiEkstra > 75

    val isLulus = isLulusUjian && isLulusAbsen
    val apaLulus = isLulusUjian && isLulusAbsen && isLulusEkstra
    //== val apaLulus = (isLulusUjian && isLulusAbsen) && isLulusEkstra
    println(isLulus)
    println(apaLulus)
}