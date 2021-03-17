package kotlinDasar
// eksekusi dulu baru looping
fun main(){
//    var i = 11
//
//    do {
//        println("perulangan ke$i")
//        i++
//    } while (i < 10)
    var sum: Int = 0
    var input: String
    println("Sum all input  -- press 0 to stop")
    do {
        println("Enter an Integer : ")
        input = readLine()!!
        sum += input.toInt()
    } while (input != "0")
    println("sum = $sum")
}