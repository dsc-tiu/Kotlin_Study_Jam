package object_oriented_things

fun main(){
    var student = Student("Abc",2)
}

class Student(private var name : String ){

    var id:Int=1

    init {
        println("Name of the Student is $name")
    }

    constructor(n:String , id: Int) : this(n){
        this.id = id
    }
}