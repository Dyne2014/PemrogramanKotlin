package kotlinDasar

// utk membuat array yg berisi berurutan, yg biasanya utk digunakan sbg perulangan
// membuat tipe data range cukup seperti 1..10
// operasi2 : count() -> total data range , contains(value) -> mengecek terdapat value tsb,
// first -> dapat nilai pertama, last -> dapat nilai akhir, step -> langkah nilai tiap kenaikan
// default range akan naik, kalau ingin turun maka gunakan  downTo
fun main(){
//    val range = 1..10000
    val range = 10000 downTo 1 step 5
    println(range.count())
    println(range.contains(2500))
    println(range.contains(50000))
    println(range.first)
    println(range.last)
    println(range.step)


}