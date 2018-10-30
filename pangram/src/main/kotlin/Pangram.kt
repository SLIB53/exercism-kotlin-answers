object Pangram {
    fun isPangram(sentence: String): Boolean {
        val letters = Regex("[a-z]").findAll(sentence.toLowerCase())
            .toList()
            .map({ m -> m.value })
            .distinct()

        return letters.count() == 26
    }
}
