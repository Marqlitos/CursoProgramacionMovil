fun Intervalo (horas: Int = 0, minutos: Int = 0, segundos: Int = 0) =
    ((horas * 60) + minutos) * 60 + segundos

fun main() {
    println(Intervalo(1, 20, 15))
    println(Intervalo(minutos = 1, segundos = 25))
    println(Intervalo(horas = 2))
    println(Intervalo(minutos = 10))
    println(Intervalo(horas = 1, segundos = 1))
}