import jdk.incubator.vector.Float16.subtract
import org.junit.platform.suite.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*
import kotlin.collections.listOf

//Exercise 1
class Case1 {
    @Test
    fun `Cumulate function successfully cumulate numbers of a list` (){
        val expectedResult:Int = numberList.sum()
        val actualResult = cumulate(listOfNmb = numberList)
        assertEquals(actualResult,expectedResult, "La fonction cumulate doit additionner tous les nombres de la liste")
    }
}
//Exercise 2
class Case2 {
    @Test
    fun `Positive division scenario`(){
        val randomNmb1:Int = numberList.random()
        val randomNmb2:Int = numberList.random()
        val biggestNmb:Int = Math.max(randomNmb2,randomNmb1)
        val smallestNmb:Int = Math.min(randomNmb2,randomNmb1)
        val actualResult:Int = divide(biggestNmb,smallestNmb)
        val expectedResult:Int = biggestNmb/smallestNmb
        assertEquals(actualResult, expectedResult)
    }
    @Test
    fun `Divide throw error when a 0 is used`(){
        val randomNmb1:Int = numberList.random()
        assertThrows<IllegalArgumentException>{
            divide(randomNmb1, 0)
        }
    }
}
//Exercise 3
class Case3 {
    @Test
    fun `isEven fun returns true when number is even`(){
        evenNmbList.forEach{
            assertTrue(isEven(it), "isEven should return true with even numbers")
        }
    }
    @Test
    fun `isEven fun returns false when number is odd`(){
        oddNmbList.forEach{
            assertFalse(isEven(it), "isEven should return false with odd numbers")
        }
    }
}
//Exercise 4
class Case4 {
    private lateinit var calculator: Calculator
    private lateinit var randomNmbList: MutableList<Int>

    @BeforeEach
    fun init() {
        calculator = Calculator()
        randomNmbList = mutableListOf()
        randomNmbList.add((Math.random() * 100).toInt())
        randomNmbList.add((Math.random() * 100).toInt())
    }

    @Test
    fun `Calculator add function assertion`() {
        val expectedResult: Int = randomNmbList[0] + randomNmbList[1]
        val actualResult: Int = calculator.add(randomNmbList[0], randomNmbList[1])
        //println("number1: ${randomNmbList[0]}, number2: ${randomNmbList[1]}\nExpected:$expectedResult\nActual:$actualResult")
        assertEquals(
            expectedResult,
            actualResult,
            "Add method of the calculator does not return the sum of the 2 parameters given"
        )
    }

    @Test
    fun `Subtraction returns a - b`() {
        var expectedResult:Int = randomNmbList.max()-randomNmbList.min()
        var actualResult: Int = calculator.subtract(randomNmbList.max(), randomNmbList.min())
        //println("number1: ${randomNmbList.max()}, number2: ${randomNmbList.min()}\nExpected:$expectedResult\nActual:$actualResult")
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Multiply returns product of number1 times number2`(){
        var expectedResult:Int = randomNmbList[0] * randomNmbList[1]
        var actualResult:Int = calculator.multiply(randomNmbList[0], randomNmbList[1])
        //println("number1: ${randomNmbList[0]}, number2: ${randomNmbList[1]}\nExpected:$expectedResult\nActual:$actualResult")
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `divide method returns quotient of number 1 divide by number 2`(){
        var biggestNmb:Int = randomNmbList.max()
        var smallestNmb:Int = randomNmbList.min().let { if(it ==0) 1 else it }
        var expectedResult:Int = biggestNmb/smallestNmb
        var actualResult:Int = calculator.divide(biggestNmb, smallestNmb)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Divide return illegalArgumentException when divided by 0`(){
        assertThrows<IllegalArgumentException>{
            calculator.divide(randomNmbList.random(), 0)
        }
        assertThrows<IllegalArgumentException>{
            calculator.divide(0, randomNmbList.random())
        }
        assertThrows<IllegalArgumentException>{
            calculator.divide(randomNmbList.min(), randomNmbList.max())
        }
    }
}

class Case5 {
    private lateinit var randomNmbList: MutableList<Int>
    @BeforeEach
    fun`init`(){
        randomNmbList = mutableListOf()
        for(i in 0..10){
            randomNmbList.add((Math.random() *100).toInt())
        }
    }
    @Test
    fun`filterEven function returns a list of even numbers`(){
        val pairNmbList:List<Int> = filterEven(randomNmbList)
        pairNmbList.forEach{
            assertTrue(it%2==0, "$it is not a even number")
        }
    }
    @Test
    fun`filterEven function returns empty list if empty list is inputted`(){
        val actualResult: List<Int> = filterEven(mutableListOf())
        assertEquals(emptyList<Int>(), actualResult)
    }
}

class Case6 {
    @Test
    fun`factorial function return the product of all the number up to the inputted number`(){
        var listofMap: MutableList<Map<String,Int>> = mutableListOf(
            mapOf("number" to 0, "factorial" to 1),
            mapOf("number" to 5, "factorial" to 120),
            mapOf("number" to 10, "factorial" to 3628800)
        )
        listofMap.forEach{
            var actual:Int = factorial(it["number"]!!)
            var expected:Int = it["factorial"]!!
            assertEquals(expected, actual)
        }
    }
    @Test
    fun `factorial throw illegalArgumentException when less than 0 is inputted`(){
        assertThrows<IllegalArgumentException>{
            factorial(-1)
        }
    }
}

class Case7 {
    val palindromeList:List<String> = listOf<String>("radar","","a","Kayak","lEVel")
    val nonPalindromeList:List<String> = listOf<String>("hello","phone", "Tennis")
    @Test
    fun`isPalindrome fun return true if word can be read from both sides`(){
        palindromeList.forEach{
            println(it)
            assertTrue(isPalindrome(it), "Word $it is not a palindrome")
        }
    }
    @Test
    fun`isPalindrome fun return false if word cannot be read from both sides`(){
        nonPalindromeList.forEach{
            assertFalse(isPalindrome(it), "Word $it is a palindrome")
        }
    }
}

class Case8 {
    @Test
    fun `Square function return the product of number multiplied by itself`(){
        val mapList:List<Map<String,Int>> = listOf(
            mapOf("number" to -5, "product" to 25),
            mapOf("number" to 0, "product" to 0),
            mapOf("number" to 2, "product" to 4),
            mapOf("number" to 3, "product" to 9),
        )
        mapList.forEach{
            val actual:Int = square(it.getValue("number"))
            val expected:Int = it.getValue("product")
            assertEquals(expected, actual)
        }
    }
}

class Case9 {
    @Test
    fun `filterAdult function returns only people older than 17yo`() {
        var personList:MutableList<Person> = mutableListOf(
            Person("Bob", 45),
            Person("Gerard", 55),
            Person("Oliver", 9),
            Person("Jacob", 8),
            Person("Billy", 18),
            Person("Timmy", 17)
            )
        val expected:MutableList<Person> = mutableListOf(
            Person("Bob", 45),
            Person("Gerard", 55),
            Person("Billy", 18),
        )
        val actual:MutableList<Person> = filterAdults(personList)
        assertEquals(actual, expected)
    }
}

class Case10 {
    val validUsername:String = "Artorias"
    val validPassword:String = "abysswalker94"
    val invalidUsername: MutableList<String> = mutableListOf("Smough", "Manus", "Ornstein")
    val invalidPassword:MutableList<String> = mutableListOf("abysswalker", "walkerabyss94", " abyswalker94 ")
    @Test
    fun `login function returns "Logged in" message when entering valid credentials`(){
        val actual:String = login(validUsername, validPassword)
        val expected:String = "Logged in"
        assertEquals(expected, actual)
    }
    @Test
    fun`Login returns InvalidCredentialsException when username is invalid`(){
        invalidUsername.forEach{
            assertThrows<InvalidCredentialsException>{
                login(it, validPassword)
            }
        }
    }
    @Test
    fun`Login returns InvalidCredentialsException when password is invalid`(){
        invalidPassword.forEach{
            assertThrows<InvalidCredentialsException>{
                login(validUsername, it)
            }
        }
    }
    @Test
    fun`Login returns InvalidCredentialsException when both credentials are invalid`(){
        for (i in 1..3){
            assertThrows<InvalidCredentialsException>{
                login(invalidUsername.random(), invalidPassword.random())
            }
        }
    }
}

