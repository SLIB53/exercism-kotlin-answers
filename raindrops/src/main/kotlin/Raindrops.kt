object Raindrops {
    fun convert(n: Int) = makeSomeNoise(n).let {
        if (!it.isEmpty()) it else n.toString()
    }
    
    private fun makeSomeNoise(n: Int): String = 
        (if (n % 3 == 0) "Pling" else "") +
        (if (n % 5 == 0) "Plang" else "") +
        (if (n % 7 == 0) "Plong" else "")
}
