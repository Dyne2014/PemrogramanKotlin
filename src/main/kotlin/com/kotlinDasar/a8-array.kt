package com.kotlinDasar

// array adalah tipe data yg berisi kumpulan data dg tipe yg sama, direpresentasikan kata kunci Array
fun main(){
    val names : Array<String> = arrayOf("ade","sh","anton","tata")
    // terdapat index pada tiap data array, dimulai dari 0
// operasi array : size -> utk dapat panjang data, get(index) & [index] -> utk mendapatkan data
// , set(index, value) & [index] = value -> utk mengubah / set data
    names[1] = "syahrif"  // val dapat dirubah "isinya", yg tdk dapat dirubah adalah variabel dari valnya sendiri
    println(names[0])

    val nilai : Array<Int> = arrayOf(1,2,4,6,7,10)
    println(nilai[4])

    val members : Array<String?> = arrayOfNulls(3) // jikalai ofnulls, harus dijelaskan sizenya
    members[0] = null; members[1] = "adaaa"; members[2] = null
    println(members[2])
}