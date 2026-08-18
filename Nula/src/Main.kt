data class empleado (val nomrbe: String, var salario: Int)

fun idempleado(id: Int) = when(id) {
    1 -> empleado("Marco", 1500)
    2 -> null
    3 -> empleado("Dany", 1200)
    4 -> empleado("Brandon", 1800)
    else -> null
}

fun idSalario(id: Int) = idempleado(id)?.salario ?: 0

fun main() {
    println((1..5).sumOf { id -> idSalario(id) })
}