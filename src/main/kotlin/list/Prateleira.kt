package list

class Prateleira(
    val genero: String,
    //Alterado para uma lista imutavel
    val livros: List<Livro>
) {

    fun organizarPorAutor(): List<Livro>{
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro>{
        return livros.sortedBy { it.anoPublicacao }
    }

}