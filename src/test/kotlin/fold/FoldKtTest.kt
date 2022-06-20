package fold

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FoldKtTest {
    @Test
    fun `sum using fold`() {
        val numbers = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(numbers.sum(), sum(*numbers))
    }
}