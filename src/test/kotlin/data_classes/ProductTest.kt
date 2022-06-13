package data_classes

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ProductTest {
    @Test
    fun `check equivalence`() {
        val p1 = Product("baseball", 10.0)
        val p2 = Product("baseball", 10.0, false)

        assertEquals(p1, p2)
        assertEquals(p1.hashCode(), p2.hashCode())
    }

    @Test
    fun `create set to check equals and hashcode`() {
        val p1 = Product("baseball", 10.0)
        val p2 = Product(price = 10.0, onSale = false, name = "baseball")

        val products = setOf(p1, p2)
        assertEquals(1, products.size)
    }

    @Test
    fun `check destructuring declarations`() {
        val (name, price, onSell) = Product(name = "baseball", price = 10.0)
        org.junit.jupiter.api.assertAll(
            { assertEquals("baseball", name) },
            { assertEquals(10.0, price) },
            { assertEquals(false, onSell) }
        )
    }
}