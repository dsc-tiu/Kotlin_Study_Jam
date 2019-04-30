package koltin_collection

fun main(){
    val list = listOf("A","B","C")

    for (i in list) println(i)

    for(i in 0 until list.size) println(list[i])

    val list1 = mutableListOf("a","b")

    list1.add("c")
    list1.remove("a")

    for(i in list1) println(i)

}