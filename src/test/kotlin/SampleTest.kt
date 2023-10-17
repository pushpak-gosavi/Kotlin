import kotlin.test.*
class SampleTest {

    val actualNumber:Int = 30

    @Test
    fun testTheNumber(){
        assertEquals(
            expected = 30,
            actual = actualNumber,
            message = "Incorrect Number, "
        )
    }

    @Test
    fun testTheNumberAssertIsError(){
        assertEquals(
            expected = 29,
            actual = actualNumber,
            message = "Incorrect Number, "
        )
    }
}