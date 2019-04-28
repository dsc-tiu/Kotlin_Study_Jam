package object_oriented_things

fun main(){

    val add = Add()

    println(add.add(3,4))
}

class Add{

    fun add(a : Int, b : Int): Int = a+b
}