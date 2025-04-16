import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {
    
    private val calculator = Calculator()
    
    @Test
    fun testAdd() {
        assertEquals(5, calculator.add(2, 3))
        assertEquals(0, calculator.add(0, 0))
        assertEquals(-1, calculator.add(-2, 1))
    }
    
    @Test
    fun testSubtract() {
        assertEquals(3, calculator.subtract(5, 2))
        assertEquals(0, calculator.subtract(0, 0))
        assertEquals(-3, calculator.subtract(-2, 1))
    }
} 