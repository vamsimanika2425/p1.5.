fun main(){
    fun add(vararg x:Int){
        var add:Int = 0
        for(i in x){
            add += i
        }
        var y:String = ""
        for(i in x){
            y += "$i,"
        }
        println("Addition of $y is $add")
    }
    fun sub(vararg x:Int){
        var sub:Int = 0
        var flag = 0
        for(i in x){
            if (flag == 0){
                flag = 1
                continue
            }
            sub -= i
        }
        var y:String = ""
        for(i in x){
            y += "$i,"
        }
        println("Subtraction of $y is $sub")
    }
    fun mul(vararg x:Int){
        var mul:Int = 1
        for(i in x){
            mul *= i
        }
        var y:String = ""
        for(i in x){
            y += "$i,"
        }
        println("Multiplication of $y is $mul")
    }
    fun div(vararg x:Int) {
        var div:Double = x[0].toDouble()
        for (i in x) {
            if(i == x[0]) {
                continue
            }
            div /= i
        }
        var y: String = ""
        for (i in x) {
            y += "$i,"
        }
        println("Division of $y is $div")
    }
    add(4,5,6,7)
    sub(1,5,8,0)
    mul(3,5,7,9)
    div(5,4,9,8)
}