fun repeticioN(n: Int, accion: () -> unidad) {
    for (i in 1..n) {
        accion()
    }
}

fun main() {
    repeticioN(5) {
        println("Hola :D")
    }
}