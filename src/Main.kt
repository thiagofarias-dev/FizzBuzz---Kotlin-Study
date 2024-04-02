fun main() {
    for (i in 1..100) { //laço for com o RANGE de 1 à 100
        println(fizzBuzz(i)) //invoca a função fizzBuzz para o item do range acima e imprime na tela
    }
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizBuzz " //Se divisível por 15
    i % 3 == 0 -> "Fizz "     //Se divisível por 3
    i % 5 == 0 -> "Buzz "     //Se divisível por 3
    else -> "$i "             //Retorna i se não for divisível por 3, 5 ou 15
}

