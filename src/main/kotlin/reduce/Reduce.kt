package reduce

fun sumReduce(vararg nums: Int) = nums.reduce { acc, i -> acc + i }