data class persona(val name: nombre, val address: direcccion, val ownsAPet: Boolean = true)
data class nombre(val first: String, val last: String)
data class direcccion(val street: String, val city: ciudad)
data class ciudad(val name: String, val countryCode: String)

fun main() {
    val person = persona(
        nombre("Marco", "Santoyo"),
        direcccion("Rinconadas", ciudad("Motoleon", "MX")),
        ownsAPet = true
    )
}