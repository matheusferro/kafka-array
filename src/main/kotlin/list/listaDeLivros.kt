package list

fun main(){

    //Criando Lista do Tipo Livro
    val meusLivros: MutableList<Livro> =
        listaDeLivro

    //ADICIONANDO NOVO ITEM A LISTA
    val livro5 = Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    )
    meusLivros.add(livro5)

    //REMOVENDO ITEM
    meusLivros.remove(livro5)

    meusLivros.imprimeListaComMarcadores()

    //Utilizando o recurso Comparable da classe Livro
    meusLivros.sorted()

    //Outro jeito de ordenar a lista
    meusLivros.sortedBy { it.anoPublicacao }

    val titulos: List<String> = meusLivros.titulosPorAnoPublicacaoDoAutor("João")
    println("Titulos filtrados pelo nome e ordenados pelo ano: $titulos")

}

fun MutableList<Livro>.titulosPorAnoPublicacaoDoAutor(prefixoAutor: String)
        : List<String> {
    return this
        .filter { it.autor.startsWith(prefixoAutor) }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
}