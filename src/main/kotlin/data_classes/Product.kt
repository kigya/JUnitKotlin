package data_classes

data class Product(
    val name: String,
    var price: Double,
    var onSale: Boolean = false
)