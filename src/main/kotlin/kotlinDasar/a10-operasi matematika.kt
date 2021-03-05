package kotlinDasar
// operasi hampir sama seperti pada java, dimana integer 10 bagi 3 akan menghasilkan integer scr default, bukan double/decimal

fun main(){
    val result = 10.0 / 3
    println(result)

    val result2 = 10 + 10 / 2
    println(result2)

    // augmented assignment
    // a += | -= | *= | /= | %= 10
    var total = 0
    val total1 = 102
    total += total1
    val total2 = 100
    total -= total2
    val total3 = 100
    total *= total3
    println(total)

    // unary operator
    // ++ -> a+=1, -- a-=1, - -> negative, + -> positive(already default), ! -> boolean kebalikan
    total++
    println(total)

    val suhu = -4
    println(suhu)

    val sehat = true
    println(!sehat)
}