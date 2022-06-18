package backing_property

class CustomerLazy(val name: String) {
    val messages: List<String> by lazy { loadMessages() }

    private fun loadMessages(): MutableList<String> =
        mutableListOf(
            "Initial contact",
            "Convinced them to use Kotlin",
            "Sold training class. Sweet."
        ).also { println("Loaded messages") }
}