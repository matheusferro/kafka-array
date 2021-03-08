package list

fun main() {
    //listaDeLivroComNull.imprimeListaComMarcadores()
    listaDeLivro
        .groupBy { it.editora ?: "Editora desconhecida:" }
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora : ${livros.joinToString { it.titulo }}")
        }
}