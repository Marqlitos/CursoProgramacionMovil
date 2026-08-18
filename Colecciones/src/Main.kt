//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numerosVerdes = listOf(1, 4, 23)
    val numerosRojos = listOf(17, 2)

    //println("numeros verdes = $numerosVerdes")
    //println("Numeros Rojos = $numerosRojos")

    val cuentaT = numerosVerdes.count() + numerosRojos.count()
    println(cuentaT)
}