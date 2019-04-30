package null_safety

fun main(){
    val name:String? = null

    //Safe call (?.) operator
    println("The length of the name is ${name?.length}")

    //Safe call with let(?,let)
    name?.let {
        println("The length of the name is ${name.length}")
    }

    //Elvis operator(?:)
    println("the length of the name is ${name?.length?:-1}")

    //Non-null assertion(!!)
    println("the length of the name is ${name!!.length}")
}