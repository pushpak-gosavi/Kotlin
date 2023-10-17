import kotlin.test.*

class SampleTest {

    val actualNumber: Int = 30

    @Test
    fun testTheNumber() {
        assertEquals(
            expected = 30,
            actual = actualNumber,
            message = "Incorrect Number, "
        )
    }

    @Test
    fun testTheNumberAssertIsError() {
        assertEquals(
            expected = 29,
            actual = actualNumber,
            message = "Incorrect Number, "
        )
    }

    @Test
    fun `calculate, the division that are fail`() {
        assertFails {
            calculateTheDivision(number1 = 100, number2 = 0)
        }
    }

    @Test
    fun `calculate, the division that are correct`(){
        assertIs<Int>(value = calculateTheDivision(number1 = 100, number2 = 10))
    }
}

fun calculateTheDivision(number1: Int, number2: Int) = number1 / number2