import kotlin.random.Random

data class Empleado(val name: String, var salary: Int)

class empleadoAleatorio(var salarioMinimo: Int, var salarioMaximo: Int) {
    val names = listOf("jose", "Marco", "Ana", "Pablo", "Javier", "Elena")
    fun generarEmpleado() =
        Empleado(names.random(),
            Random.nextInt(from = salarioMinimo, until = salarioMaximo))
}

fun main() {
    val empGen =empleadoAleatorio(10, 30)
    println(empGen.generarEmpleado())
    println(empGen.generarEmpleado())
    println(empGen.generarEmpleado())
    empGen.salarioMinimo = 50
    empGen.salarioMaximo = 100
    println(empGen.generarEmpleado())
}