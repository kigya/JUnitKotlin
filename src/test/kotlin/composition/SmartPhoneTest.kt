package composition

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SmartPhoneTest {

    private val smartPhone = SmartPhone()

    @Test
    fun `Dialing delegates to internal phone`() {
        assertEquals("Dialing 12345", smartPhone.dial("12345"))
    }

    @Test
    fun `Taking picture delegates to internal camera`() {
        assertEquals("Taking a picture", smartPhone.takePicture())
    }

}