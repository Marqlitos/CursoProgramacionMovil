fun main (){
    val Apoyo = setOf("HTTP", "HTTPS", "FTP")
    val Solicitado = "smtp"
    val Compatibles =  Solicitado.uppercase() in Apoyo
        println("Soporte para: $Solicitado : $Compatibles")
}