package null_safety

val pi : Float by lazy { 3.14f }

fun main(){
    val area = pi*4*4
    println("area = $area")
}