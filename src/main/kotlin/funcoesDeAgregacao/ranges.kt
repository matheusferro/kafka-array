package funcoesDeAgregacao

fun ranges (){
    val range: IntRange = 1.rangeTo(10)
    for(i in range){
        print(i)
    }
    println()

    //Range de 0 até 100 de 2 em 2 (incluindo o 100)
    var numerosPares: IntProgression = 0..100 step 2
    //Range de 0 até 100 de 2 em 2 (não incluindo o 100)
    numerosPares = 0.until(100) step 2
    print("numeros pares:")
    numerosPares.forEach{print("$it")}
    println()

    print("numeros pares reverso:")
    val numesParesReverso = 100 downTo 0 step 2
    numesParesReverso.forEach{print("$it ")}
    println()

    val intervalo = 1500.0..5000.0
    val salario: Double = 4000.0
    if(salario in intervalo){
        println("Está no intervalo.")
    }
}