fun arrayBasico() {
    /**
     * Criando Arrays de inteiros.
     */
    val idades: IntArray = intArrayOf(29, 18, 37, 41, 60)
    //val idades = IntArray(numeroDeIndicies)

    /**
     * Percorrendo o Array.
     */
    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (maiorIdade < idade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(menorIdade)
}