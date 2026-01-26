fun main(){
    println("enter your age")
    var age=readLine()!!.toInt()
    if(age<13){
        println("child")
    }
    else if(age>13 && age<19){
        println("teenager")
    }
    else{
        println("adult")
    }

}