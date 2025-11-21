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
    require(n>=0) {"factorial input is less than zero"}
    var total:Int = 1
    for(i in 2..n){
        total *= i
    }
    return total
}
fun isPalindrome(word:String):Boolean{
    val wordLowerCase = word.lowercase()
    val reversedWord = wordLowerCase.reversed()
    return wordLowerCase == reversedWord
}
fun square(number:Int):Int{
    return number*number
}
fun filterAdults(list:MutableList<Person>):MutableList<Person> {
    var adults: MutableList<Person> = list.filter { it.age > 17 }.toMutableList()
    return adults
}
fun login(username:String, password:String):String{
    val correctUsername = "Artorias"
    val correctPassword = "abysswalker94"
    if(username == correctUsername && password == correctPassword)return "Logged in" else throw InvalidCredentialsException()
}