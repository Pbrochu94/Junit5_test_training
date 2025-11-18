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
