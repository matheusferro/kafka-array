package list

fun List<Livro?>.imprimeListaComMarcadores() {
    val listaComMarcadores = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("\n ### Lista de Livros ### \n${listaComMarcadores}")
}