package tailrec

import java.math.BigInteger

fun recursiveFactorial(n: Long): BigInteger = when (n) {
    0L, 1L -> BigInteger.ONE
    else -> BigInteger.valueOf(n) * recursiveFactorial(n - 1)
}