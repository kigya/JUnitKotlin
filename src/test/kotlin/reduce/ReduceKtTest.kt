package reduce

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ReduceKtTest {
    @Test
    fun `sum using reduce`() {
        val numbers = intArrayOf(3, 1, 4, 1, 5, 9)
        assertAll({ assertEquals(numbers.sum(), sumReduce(*numbers)) }, {
            assertThrows<UnsupportedOperationException> {
                sumReduce()
            }
        })
    }
}