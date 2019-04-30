package null_safety

fun main(){
    val country = Country()
    country.setUp()
}

class Country{
    lateinit var name:String

    fun setUp(){
        name = "asas"
        println(name)
    }
}