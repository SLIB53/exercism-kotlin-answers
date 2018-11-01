object Pangram {
    fun isPangram(sentence: String): Boolean {
        return sentence.toLowerCase().toSet()
            .containsAll(('a'..'z').toSet())
    }
}
