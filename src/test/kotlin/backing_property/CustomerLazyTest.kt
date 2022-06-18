package backing_property

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CustomerLazyTest {
    @Test
    fun `load messages by lazy`() {
        val customer = Customer("Fred").apply { messages }
        assertEquals(3, customer.messages.size)
    }
}