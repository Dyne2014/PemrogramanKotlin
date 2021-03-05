package kotlinDasar
// string adalah teks
// string memakai dengan " " atau """ """ utk kalimat lebih dari 1 baris
fun main(){
    val firstname = "Syahrif"
    val lastname = "H"
    val address = """
        >jl.taman bahagia no.2
        >kota sukabumi
        >kabupaten sukabumi
    """.trimMargin(">")

    println(firstname)
    println(lastname)
    println(address)

    // string concatenate / menggabungkan string
    val fullname = "$firstname $lastname"  // variabel dalam "" string disebut string template
    val desc = "Total $fullname length is = ${fullname.length}"
    println(fullname)
}
