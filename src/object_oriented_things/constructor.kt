package object_oriented_things

fun main(){

    val display = Display("Kotlin Study Jam")
    display.show()
}
class Display(var name : String){

    fun show() = println(name)
}