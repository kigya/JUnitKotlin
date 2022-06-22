package tailrec

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.math.BigInteger

internal class TailrecKtTest {
    @Test
    fun `check recursive factorial`() {
        assertAll({ assertThat(recursiveFactorial(0), `is`(BigInteger.ONE)) },
            { assertThat(recursiveFactorial(1), `is`(BigInteger.ONE)) },
            { assertThat(recursiveFactorial(2), `is`(BigInteger.valueOf(2))) },
            { assertThat(recursiveFactorial(5), `is`(BigInteger.valueOf(120))) },
            { assertThrows<StackOverflowError> { recursiveFactorial(10_000) } })
    }
}

@JvmOverloads
tailrec fun factorial(
    n: Long, acc: BigInteger = BigInteger.ONE
): BigInteger = when (n) {
    0L -> BigInteger.ONE
    1L -> acc
    else -> factorial(n - 1, acc * BigInteger.valueOf(n))
}