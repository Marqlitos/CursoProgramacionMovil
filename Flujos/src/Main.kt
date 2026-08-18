import kotlin.random.Random
fun main() {
    val primerResultado = Random.nextInt(6)
    val segundoResultado = Random.nextInt(6)

    if (primerResultado == segundoResultado) {
        println("Tu ganas :D")
    }
    else
        println("Tu pierdes :(")
}