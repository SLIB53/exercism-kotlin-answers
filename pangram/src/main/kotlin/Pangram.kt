object Pangram {
    fun isPangram(sentence: String) =
        sentence.toLowerCase().toSet()
            .containsAll(('a'..'z').toSet())
}
