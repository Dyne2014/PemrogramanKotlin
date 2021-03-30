package com.kotlinDasar

// gunakan utk function yg simple / looping yg sedikit
// no inline agar menandai parameter bukan sebuah inline
inline fun hello(firstName: () -> String, noinline lastName: () -> String): String{
    return "Halow ${firstName()} ${lastName()}"
}

fun main(){
    for (i in 0..100){
        println(hello({"Syahr"}, {"Hikm"}) + " $i")
    }
}


//
//You can inline when all functional type parameters are called directly or passed to other inline function
//You should inline when ^ is the case.
//You cannot inline when function parameter is being assigned to a variable inside the function
//You should consider inlining if at least one of your functional type parameters can be inlined, use noinline for the others.
//You should not inline huge functions, think about generated byte code. It will be copied to all places the function is called from.
//Another use case is reified type parameters, which require you to use inline. Read here.
//
//Share
//Improve this answer
//Follow
//edited Sep 4 '20 at 15:52
//answered M