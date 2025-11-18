fun cumulate(listOfNmb: MutableList<Int>):Int{
    var cumulation:Int = numberList[0]
    for (i in 1 until numberList.size) {
        cumulation+=numberList[i]
    }
    return cumulation
}
fun divide(a:Int, b:Int):Int{
    if(b ==0) throw IllegalArgumentException("divide error")
    return a/b
}
fun isEven(number:Int):Boolean{
    return number%2==0
}
fun filterEven(numberList:MutableList<Int>):List<Int>{
    if(numberList.isEmpty()) return listOf()
    return numberList.filter{it%2==0}
}
fun factorial(n:Int):Int{
    if(n<0) throw IllegalArgumentException("factorial input is less than zero")
    var total:Int = 1
    for(i in 2..n){
        total *= i
    }
    return total
}