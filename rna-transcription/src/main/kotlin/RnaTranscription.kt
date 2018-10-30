fun transcribeToRna(dna: String): String {
    val rnaNucleotides = dna.map({ n ->
        when (n) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> throw IllegalArgumentException()
        }
    })

    return rnaNucleotides.joinToString("")
}
