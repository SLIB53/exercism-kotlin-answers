import kotlin.math.pow

class Squares(private val n: Int) {
    private val sequence = 1..n

    fun squareOfSum() = sequence.sum().let { it * it }

    fun sumOfSquares() = sequence.sumBy { it * it }

    fun difference() = squareOfSum() - sumOfSquares()
}
