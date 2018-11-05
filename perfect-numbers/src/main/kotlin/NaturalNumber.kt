
enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    require (naturalNumber > 0)

    return aliquotSum(naturalNumber).compareTo(naturalNumber).let {
        when {
            it < 0 -> Classification.DEFICIENT
            it == 0 -> Classification.PERFECT
            else -> Classification.ABUNDANT
        }
    }
}

fun aliquotSum(naturalNumber: Int): Int {
    return factors(naturalNumber).sum()
}

fun factors(naturalNumber: Int): List<Int> {
    return (1..(naturalNumber / 2)).filter { naturalNumber % it == 0 }
}
