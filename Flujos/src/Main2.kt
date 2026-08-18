fun main(){
    val btn = "A"
    println(
        when(btn){
            "A" -> "Adelante"
            "B" -> "Atras"
            "X" -> "Menu"
            "Y" -> "Nada"

            else -> "No existe ese boton"
        }
    )
}