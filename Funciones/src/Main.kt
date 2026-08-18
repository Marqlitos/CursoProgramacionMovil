import kotlin.math.PI

fun areaCirculo (radius : Int) : Double{
    return PI * radius * radius
}

fun main() {
    println(areaCirculo(2))
}