package com.kotlinDasar

// menandai expression dengan label
// membreak saat i mencapai lebih dari 5
fun labelBreak(){
    loopi@for (i in 1..10){
        loopj@for (j in 1..10){
            if (i > 5){
                break@loopi
            }
            println("$i * $j = ${i * j}")
        }
    }
}

// mengskip j saat mencapai 5
fun labelContinue(){
    loopi@for (i in 1..10){
        loopj@for (j in 1..10){
            if (j == 5){
                continue@loopi
            }
            println("$i * $j = ${i * j}")
        }
    }
}

// dgn label kita bisa diintegrasikan dengan break, continue, return
fun main(){
    fun test(name: String, operation:(String) -> Unit): Unit = operation(name)

    test("a") test@{
        if (it == "a"){
            return@test
        } else {
            println("syah")
        }
    }
}

// label jangan terlalu dibanyak dibuat karna dapat membingungkan.