package funcoesDeAgregacao

import util.bigDecimalArrayOf
import util.media
import util.somatoria
import java.math.RoundingMode

fun arrayDeObjetos(){

    //val salarios = Array<BigDecimal>(size = 5){ BigDecimal.ZERO }
    //salarios[0] = "1550.30".toBigDecimal()

    val salarios = bigDecimalArrayOf("1550.33", "760.25", "8000.71", "5230.53")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salarios.map { salario ->
        if(salario < "5000".toBigDecimal()){
            salario + "500".toBigDecimal()
        }else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }

    }.toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto total ${gastoInicial}")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial){ acc, salario ->
        acc +(salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto total  ${gastoTotal}")

    var mediaMaioresSalarios = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    println("Média maiores salarios: ${mediaMaioresSalarios}")
}

