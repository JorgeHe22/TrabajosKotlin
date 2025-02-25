fun main() {

    var moneda20=0
    var moneda50=0
    var moneda100=0
    var moneda200=0
    var moneda500=0
    var continuar = true


    while (continuar) {
        println(
            """
        ¿Que deseas hacer?
        1. Agregar monedas
        2. Contar monedas
        3. Calcular el dinero ahorrado
        4. Vaciar la alcancia 
        5. Salir al menú
    """.trimIndent()
        )

        println("Elgie una opcion: ")
        when (readLine()?.toIntOrNull()){
            1 -> {
                var seguirAgregando = true

                while (seguirAgregando) {
                    println(
                        """
                     Ingresa el valor de la moneda: 
                        1. Moneda de 20
                        2. Moneda de 50
                        3. Moneda de 100
                        4. Moneda de 200
                        5. Moneda de 500
                        
                    """.trimIndent()
                    )


                    println("Elige una opcion: ")
                    when (readLine()?.toIntOrNull()) {
                        1 -> {
                            moneda20++
                            println("Se agrego la moneda de 20")
                        }

                        2 -> {
                            moneda50++
                            println("Se agrego la moneda de 50")
                        }

                        3 -> {
                            moneda100++
                            println("Se agrego la moneda de 100")
                        }

                        4 -> {
                            moneda200++
                            println("Se agrego la moneda de 200")
                        }

                        5 -> {
                            moneda500++
                            println("Se agrego la moneda de 500")
                        }

                        6 -> {
                            seguirAgregando = false
                            println("Volviendo al menú principal...")
                        }

                        else -> println("Opcion no valida. Por favor intentar de nuevo")

                    }
                }

            }
            2 -> {
                println("\n Conteo de tus monedas")
                println("Monedas de 20: $moneda20")
                println("Mondesas de 50: $moneda50")
                println("Monedas de 100: $moneda100")
                println("Monedas de 200: $moneda200")
                println("Monedas de 500: $moneda500")
                println("Total de monedas: ${moneda20 + moneda50 + moneda100 + moneda200 + moneda500}")
            }
            3 -> {
                val total = (moneda20 * 20) + (moneda50 * 50) + (moneda100 * 100) + (moneda200 * 200) + (moneda500 * 500)
                println("\n Total dinero ahorrado")
                println("Total Monedas de 20: ${moneda20*20}")
                println("Total Monedas de 50: ${moneda50*50}")
                println("Total Monedas de 100: ${moneda100*100}")
                println("Total Monedas de 200: ${moneda200*200}")
                println("Total Monedas de 500: ${moneda500*500}")
                println("Total de Dinero Ahorrado: $total")
            }
            4 -> {
                println("Vaciando la alcancia...")
                moneda20 = 0
                moneda50 = 0
                moneda100 = 0
                moneda200 = 0
                moneda500 = 0
            }
            5 -> {
                println("Saliendo al Menú")
                continuar=false
            }
        }
    }
}