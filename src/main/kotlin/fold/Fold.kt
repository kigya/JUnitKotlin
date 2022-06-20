package fold

import java.math.BigInteger

fun sum(vararg nums: Int): Int = nums.fold(0) { acc, i -> acc + i }

fun sunWithTrace(vararg nums: Int) = nums.fold(0) { acc, i ->
    println("acc = $acc, n = $i")
    acc + i
}

fun recursiveFactorial(n: Long): BigInteger = when (n) {
    0L, 1L -> BigInteger.ONE
    else -> BigInteger.valueOf(n) * recursiveFactorial(n - 1)
}

fun factorialFold(n: Long): BigInteger = when (n) {
    0L, 1L -> BigInteger.ONE
    else -> (2..n).fold(BigInteger.ONE) { acc, i ->
        acc * BigInteger.valueOf(i)
    }
}

fun fibonacciFold(n: Int) = (2 until n).fold(1 to 1) { (prev, curr), _ ->
    curr to (prev + curr)
}.second
