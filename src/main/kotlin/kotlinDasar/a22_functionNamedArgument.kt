package kotlinDasar

// fitur ini tdk ada dijava
// hasil yg dikeluarkan akan tetap sama walaupun tidak berurutan dengan pemanggilang
// parameternya
fun fullname(firstName: String,
            middleName: String,
            lastName: String){
    println("Hellow $firstName $middleName $lastName")
}

// jika menggunakan named argument maka tidak bisa dimix dengan default argument
fun main(){
fullname("Syahriful","D","Hikmatulloh")
fullname(
    lastName = "Hikmatulloh",
    firstName = "Syahriful",
    middleName = "D"
)
}

