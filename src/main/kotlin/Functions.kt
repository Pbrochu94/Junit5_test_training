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