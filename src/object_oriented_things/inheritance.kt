package object_oriented_things

fun main(){
    val tata = Tata()
    tata.color = "Grey"
    tata.speed = "120KM"
    tata.wheel()

    val maruti = Maruti()
    maruti.wheel()
}

class Tata:Car(){

    override fun wheel() = println("10 wheels")
}

class Maruti:Car(){

    override fun wheel() = println("8 wheels")
}

open class Car{
    var color: String = ""
    var speed: String = ""

    open fun wheel() = println("4 wheels")
}


