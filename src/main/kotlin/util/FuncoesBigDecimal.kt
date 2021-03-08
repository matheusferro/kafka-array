package util

import java.math.BigDecimal

/**
 *  Converte um os parâmetros de String para um Array de BigDecimal.
 *
 * @param valores Parâmetros string que serão convertidos para BigDecimal.
 */
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(size = valores.size){ i ->
        valores[i].toBigDecimal()
    }
}

/**
 * Retorna a somatoria dos valores de um Array de BigDecimal.
 */
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce{acc, valor -> acc + valor}
}

/**
 * Calcula a média de um array de Big Decimal.
 * Se array esta vazio retorna 0.
 */
fun Array<BigDecimal>.media(): BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria() / this.size.toBigDecimal()
    }


}