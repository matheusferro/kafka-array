fun manipulandoValores() {
    //Array com valores double
    val salarios: DoubleArray = doubleArrayOf(5000.0, 3000.0, 2666.6)
    val aumento = 1.1

    /**
     *  var indiceManual = 0
     *  for (salario in salarios){
     *      salarios[indiceManual] = salario * aumento
     *      indiceManual++
     *  }
     *  println(salarios.contentToString())
     */


    //Simplificando com o recurso de indices
    /**
     * for (indice in salarios.indices){
     *      salarios[indice] = salarios[indice] * aumento
     * }
     * println(salarios.contentToString())
     */

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}