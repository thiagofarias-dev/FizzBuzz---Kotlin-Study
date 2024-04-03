import java.util.*

fun main() {

    println("""
      █████▒██▓▒███████▒▒███████▒    ▄▄▄▄    █    ██ ▒███████▒▒███████▒    ▒██▒
    ▓██   ▒▓██▒▒ ▒ ▒ ▄▀░▒ ▒ ▒ ▄▀░   ▓█████▄  ██  ▓██▒▒ ▒ ▒ ▄▀░▒ ▒ ▒ ▄▀░    ░██░
    ▒████ ░▒██▒░ ▒ ▄▀▒░ ░ ▒ ▄▀▒░    ▒██▒ ▄██▓██  ▒██░░ ▒ ▄▀▒░ ░ ▒ ▄▀▒░     ░██░
    ░▓█▒  ░░██░  ▄▀▒   ░  ▄▀▒   ░   ▒██░█▀  ▓▓█  ░██░  ▄▀▒   ░  ▄▀▒   ░    ▓██▒
    ░▒█░   ░██░▒███████▒▒███████▒   ░▓█  ▀█▓▒▒█████▓ ▒███████▒▒███████▒    ▒▄▄ 
     ▒ ░   ░▓  ░▒▒ ▓░▒░▒░▒▒ ▓░▒░▒   ░▒▓███▀▒░▒▓▒ ▒ ▒ ░▒▒ ▓░▒░▒░▒▒ ▓░▒░▒    ░▀▀▒
     ░      ▒ ░░░▒ ▒ ░ ▒░░▒ ▒ ░ ▒   ▒░▒   ░ ░░▒░ ░ ░ ░░▒ ▒ ░ ▒░░▒ ▒ ░ ▒    ░  ░
     ░ ░    ▒ ░░ ░ ░ ░ ░░ ░ ░ ░ ░    ░    ░  ░░░ ░ ░ ░ ░ ░ ░ ░░ ░ ░ ░ ░       ░
            ░    ░ ░      ░ ░        ░         ░       ░ ░      ░ ░        ░   
               ░        ░                 ░          ░        ░                
            """)
    println("Bem vindo ao FIZZBUZZ!!! ")

    var rpt = true  //variável para o while principal, de repetição do jogo

    while (rpt == true) {
        println("-----------------")
        println("1: Modo Crescente")
        println("2: Modo Decrescente em pares")
        println("0: SAIR")
        println("-----------------")
    println()
    print("Escolha o modo de jogo: ")

    val scan=Scanner(System.`in`)

    val opt:Int=scan.nextInt()

    when (opt){
        1 -> for (i in 1..100) println(fizzBuzz(i)) //laço for com o RANGE de 1 a 100, invoca a função fizzBuzz para o item do range acima e imprime na tela
        2 -> for (i in 100 downTo 1 step 2) println(fizzBuzz(i)) //laço for com range invertido de 100 a 1 e passo 2, invoca a função fizzBuzz para o item do range acima e imprime na tela
        0 -> rpt = false
        else -> {println("Opção inválida!")

        }
    }
        when (rpt){
            true -> finished()
            else -> println("Adeus!")
        }


//    for (i in 1..100) { //laço for com o RANGE de 1 à 100
//        println(fizzBuzz(i)) //invoca a função fizzBuzz para o item do range acima e imprime na tela
//    }
//    for (i in 100 downTo 1 step 2) {
//        println(fizzBuzz(i))
//    }


}
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println("""
                          ▄████  ▄▄▄       ███▄ ▄███▓▓█████     ▒█████   ██▒   █▓▓█████  ██▀███  
                         ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀    ▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒
                        ▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███      ▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒
                        ░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄    ▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  
                        ░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒   ░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒
                         ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░   ░ ▒░▒░▒░    ░ ▒░  ░░ ▒░ ░░ ▒▓ ░▒▓░
                          ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░     ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░
                        ░ ░   ░   ░   ▒   ░      ░      ░      ░ ░ ░ ▒       ░░     ░     ░░   ░ 
                              ░       ░  ░       ░      ░  ░       ░ ░        ░     ░  ░   ░     
                                                                             ░                   
                """.trimIndent())
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizBuzz " //Se divisível por 15
    i % 3 == 0 -> "Fizz "     //Se divisível por 3
    i % 5 == 0 -> "Buzz "     //Se divisível por 3
    else -> "$i "             //Retorna i se não for divisível por 3, 5 ou 15
}

fun finished() {    //banner para rodar a cada finalização de modo de jogo
    println("---------------")
    println()
    println("Iniciando novo jogo.")
    println()
}