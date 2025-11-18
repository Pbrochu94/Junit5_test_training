import jdk.incubator.vector.Float16.subtract
import org.junit.platform.suite.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*

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

    @BeforeEach
    fun calculatorInit() {
        calculator = Calculator()
    }

    @Test
    fun `Calculator add function assertion`() {
        val number1: Int = (Math.random() * 100).toInt()
        val number2: Int = (Math.random() * 100).toInt()
        val expectedResult: Int = number1 + number2
        val actualResult: Int = calculator.add(number1, number2)
        println("Expected: $expectedResult\nActual: $actualResult")
        assertEquals(
            expectedResult,
            actualResult,
            "Add method of the calculator does not return the sum of the 2 parameters given"
        )
    }

    @Test
    fun `Subtraction returns a - b`() {
        var randomNmb: List<Int> = listOf((Math.random() * 1000).toInt(),(Math.random() * 1000).toInt())
        var biggestNmb:Int = randomNmb.max()
        var smallestNmb:Int = randomNmb.min()
        var expectedResult:Int = biggestNmb-smallestNmb
        var actualResult: Int = calculator.subtract(biggestNmb, smallestNmb)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Subtract returns IllegalArgumentExeption when Difference smaller than 0`(){
        var number:Int = (Math.random() * 1000).toInt()
        var biggerNmb:Int = number+1
        assertThrows<IllegalArgumentException>{
            calculator.subtract(number, biggerNmb)
        }
    }

    @Test
    fun `Multiply returns product of number1 times number2`(){
        var number1:Int = (Math.random() * 1000).toInt()
        var number2:Int = (Math.random() * 1000).toInt()
        var expectedResult:Int = number1*number2
        var actualResult:Int = calculator.multiply(number1, number2)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `divide method returns quotient of number 1 divide by number 2`(){
        var randomNmb: List<Int> = listOf((Math.random() * 1000).toInt(),(Math.random() * 1000).toInt())
        var biggestNmb:Int = randomNmb.max()
        var smallestNmb:Int = randomNmb.min().let { if(it ==0) 1 else it }
        var expectedResult:Int = biggestNmb/smallestNmb
        var actualResult:Int = calculator.divide(biggestNmb, smallestNmb)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Divide return illegalArgumentException`(){
        assertThrows<IllegalArgumentException>{
            calculator.divide(100, 0)
        }
    }
}
