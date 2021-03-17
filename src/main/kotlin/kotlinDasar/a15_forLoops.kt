package kotlinDasar

fun main(){
    val res: Int
    var total = 0
    val array = arrayOf("Ade", "Bade", "Cade", "Dade")
    for (name in array){
        println(name)
        total++
    }
    println("total Perulangan : $total")

    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray){
        println("index ke $i = ${array[i]}")
    }

    reverseSeq(5)
}

fun reverseSeq(n: Int) {
    return print(intArrayOf(n downTo 1 ))
}
fun intArrayOf(elements: IntProgression) {
}
