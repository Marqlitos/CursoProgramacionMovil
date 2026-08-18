fun main() {
    for (numero in 1..100) {
        println(
            when {
                numero % 15 == 0 -> "tzzz pum"
                numero % 3 == 0 -> "tzzzz"
                numero % 5 == 0 -> "fizzz"
                else -> "$numero"
            }
        )
    }
}