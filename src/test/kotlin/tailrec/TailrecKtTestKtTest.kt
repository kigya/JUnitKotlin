package tailrec

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.math.BigInteger

internal class TailrecKtTestKtTest {
    @Test
    fun `factorial tests`() {
        assertAll(
            { assertThat(factorial(0), `is`(BigInteger.ONE)) },
            { assertThat(factorial(1), `is`(BigInteger.ONE)) },
            { assertThat(factorial(2), `is`(BigInteger.valueOf(2))) },
            { assertThat(factorial(5), `is`(BigInteger.valueOf(120))) },
            // ...
            { assertThat(factorial(15000).toString().length, `is`(56130)) },
            { assertThat(factorial(75000).toString().length, `is`(333061)) }
        )
    }

}