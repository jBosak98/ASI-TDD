import org.junit.Test
import kotlin.test.assertEquals

class FibonacciTest {

    @Test
    fun testFibonacci() {
        val cases= hashMapOf<Int,Int>(
                0 to 0,
                1 to 1,
                2 to 1,
                3 to 2
        )
        cases.forEach { input, solution ->
            assertEquals(solution, fib(input))
        }
    }


    @Test

    fun testFibonacciArrays(){
        val cases:Array<Array<Int>> = arrayOf(
                arrayOf(0,0),
                arrayOf(1,1),
                arrayOf(2,1)
        )
        cases.forEachIndexed { index: Int, case: Array<Int> ->
            assertEquals(case[1],fib(case[0]))
        }
    }
}
