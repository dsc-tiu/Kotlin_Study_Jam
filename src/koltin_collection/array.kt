package koltin_collection

fun main(){

    val myArray = Array(5) {4}

    myArray[4] = 34
    myArray[2] = 54

    for(i in myArray) println(i)
}