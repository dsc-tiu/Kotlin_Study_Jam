package function

fun main(){

    val a = 2
    val b = 3
    val greaterValue = a greaterValue b
    println(greaterValue)
}

infix fun Int.greaterValue(other:Int): Int {
    return if(this>other)
        this
    else
        other
}