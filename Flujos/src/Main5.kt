fun main() {
    val palabras = listOf("dinosaurio", "limosina", "revista", "lenguaje")
    for (w in palabras) {
        if (w.startsWith("l"))
            println(w)
    }
}