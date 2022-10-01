open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age:
Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age:
    Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }
}
fun main(){
    var s1=Student("VAMSI","MEKALA",22,20012531039,"CE-AI","B","AI2")
    var s2=Student("REDDY","SANAMPUDI",19,20012531040,"CE-AI","B","AI2")
    var s3=Student("VENU","KALLAM",20,20012531010,"CE-AI","B","AI2")
    var s4=Student("VENKY","VIPPARALA",21,20012531042,"CE-AI","B","AI2")
    var s5=Student("AJAY","PARI",22,20012531020,"CE-AI","B","AI1")
}


