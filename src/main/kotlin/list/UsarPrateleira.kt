package list

fun main(){
    val prateleira: Prateleira = Prateleira(genero = "Literatura", livros = listaDeLivro)

    val porAutor: List<Livro> = prateleira.organizarPorAutor()
    val porAnoPublicacao: List<Livro> = prateleira.organizarPorAnoPublicacao()
    /**
     * Agora as duas variaveis tem seus valores diferentes,
     * usando o List (lista imutavel), não é modificado o próprio objeto
     * e sim retornado uma lista modificada.
     */
    porAutor.imprimeListaComMarcadores()
    porAnoPublicacao.imprimeListaComMarcadores()
}