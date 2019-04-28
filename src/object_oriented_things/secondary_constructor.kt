package object_oriented_things

fun main(){
    Student("Abc",2)
}

class Student(name : String ){

    var id:Int=1

    init {
        println("Name of the Student is $name")
    }

    constructor(n:String , id: Int) : this(n){
        this.id = id
    }
}