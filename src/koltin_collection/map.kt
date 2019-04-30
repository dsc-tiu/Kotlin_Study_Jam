package koltin_collection

fun main(){

    val myMap = mapOf(3 to "A",2 to "B")

    for(i in myMap) println(i)

    val myMap1 = hashMapOf(5 to "add",1 to "multi")
    myMap1[4] = "Divide"

    for (i in myMap1) println(i)
}