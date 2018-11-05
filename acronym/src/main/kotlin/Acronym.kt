object Acronym {
    fun generate(phrase: String) =
        Regex("""\b\w""").findAll(phrase)
            .map { it.value }
            .joinToString("")
            .toUpperCase()
}
