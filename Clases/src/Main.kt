data class empleado (val nombre: String, var salario: Int)

fun main() {
    val emp = empleado("Marco", 1500)
    println(emp)
    emp.salario += 10
    println(emp)
}