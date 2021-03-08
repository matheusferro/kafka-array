package funcoesDeAgregacao

fun operacoesAgregadoras(){
    val idades: IntArray = intArrayOf(29, 18, 37, 41, 60, 77, 23, 54, 67, 10)

    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val mediaIdades = idades.average()
    println("Média das idades: ${mediaIdades}")

    val todosMaiores: Boolean = idades.all{it >= 18}
    println("Todos maiores: ${todosMaiores}")

    val temMaiores: Boolean = idades.any{it >= 18}
    println("Tem maiores: ${temMaiores}")

    val maiores = idades.filter{it >= 18}
    println("Idades maiores: ${maiores}")

    val busca = idades.find{it >= 60}
    println("Busca: ${busca}")
}