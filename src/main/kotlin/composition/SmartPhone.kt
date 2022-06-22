package composition

interface Dialable {
    fun dial(number: String): String
}

class Phone : Dialable {
    override fun dial(number: String): String = "Dialing $number"
}

interface Snappable {
    fun takePicture(): String
}

class Camera : Snappable {
    override fun takePicture(): String = "Taking a picture"
}

class SmartPhone(private val phone: Phone = Phone(), private val camera: Camera = Camera()) : Dialable by phone,
    Snappable by camera