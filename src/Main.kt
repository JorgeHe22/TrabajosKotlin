import java.util.Scanner
fun main() {

    val scanner = Scanner(System.`in`)
    var intentosFallidos = 0
    val intentosMax = 3

    while (intentosFallidos < intentosMax) {
        println("Bienvenido, para acceder al edificio ingrese su codigo de acceso: ")

        val codigo = scanner.nextInt()

        when {
            codigo in 1000..1999 -> {
                println("¡Codigo aceptado! Bienvenido empleado #$codigo")
                break
            }

            codigo in 2000..2999 -> {
                println("Codigo de visitante, por favor complete el registro: ")
                scanner.nextLine()

                println("Ingrese su nombre: ")
                val nombre = scanner.nextLine()

                println("Cual es el motivo de su visita: ")
                val motVist = scanner.nextLine()

                println("Registro completo. Bienvenido $nombre. Motivo: $motVist")
                break
            }

            else -> {
                intentosFallidos++
                println("Codigo incorrecto. Intento: $intentosFallidos\nNumero maximo de intentos: $intentosMax")

                if (intentosFallidos >= intentosMax) {
                    println("Ha excedido el numero maximo de intentos.")
                }
            }
        }

    }
}