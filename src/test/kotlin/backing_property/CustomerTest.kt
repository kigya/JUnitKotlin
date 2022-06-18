package backing_property

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CustomerTest {
    @Test
    fun `load messages`() {
        val customer = Customer("Fred").apply { messages }
        assertEquals(3, customer.messages.size)
    }
}