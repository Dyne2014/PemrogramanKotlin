package com.kotlinDasar

import com.kotlinDasar.util.sayHello

// import * utk menaambil semua function importnya namun ini adalah cara yg kurang direkomendasikan
// penamaan package dengan lowercase, sub package dengan tanda . ( titik )
fun main(){
    sayHello("syarh")
    com.kotlinDasar.util.sayHello("Syarif")
}