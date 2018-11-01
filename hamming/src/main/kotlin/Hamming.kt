val dnaMismatchExcept = IllegalArgumentException("left and right strands must be of equal length.")

object Hamming {
    fun compute(dnaStrandA: String, dnaStrandB: String): Int {
        if (dnaStrandA.length == dnaStrandB.length) {
            val deltas = dnaStrandA
                .toCharArray()
                .zip(dnaStrandB.toCharArray()).map { (a, b) ->
                    if (a == b) 0 else 1
                }

            return deltas.sum()
        }
        else throw dnaMismatchExcept
    }
}
