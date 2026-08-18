fun main() {
    val acciones = listOf("titulo", "anio", "autor")
    val prefijo = "https://example.com/book-info"
    val id = 5
    val links = acciones.map { accion -> "$prefijo/$id/$accion" }
    println(links)
}