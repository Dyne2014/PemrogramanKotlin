package kotlinDasar

// posisi vararg harus di ujung, nggak boleh di tengah tengah atau di awal

// jika menggunakan array sebagai parameter
//fun hitungTotal(values: Array<Int>): Int {
//    var total = 0
//
//    for (value in values) {
//        total += value
//    }
//    return total
//}
//
//fun main(){
//    val values = arrayOf(10,10,15)
//    val result = hitungTotal(values)
//}

// jika menggunakan vararg sebagai parameter
// didalam fungsinya otomatis menjadi array juga
fun hitungTotal(name: String,vararg values: Int): Int {
    var total = 0
    val nama = name
    for (value in values) {
        total += value
    }
    return total
}

fun main(){
    print(hitungTotal("Syahrif",10,10,15))
}
// vararg harus ada di parameter posisi paling kanan / akhir