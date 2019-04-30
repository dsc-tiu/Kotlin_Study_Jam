package koltin_collection

fun main(){

    val mySet = setOf(0,1,2,3)
    for(i in mySet) println(i)

    val mySet1 = mutableSetOf("A","B")
    mySet1.add("c")
    mySet1.remove("B")

    for(i in mySet1) println(i)

    val mySet2 = hashSetOf(0,1,2,3,4)
    for(i in mySet2) println(i)
}