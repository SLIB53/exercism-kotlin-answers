object Hamming {
    fun compute(dnaStrandA: String, dnaStrandB: String): Int {
        require(dnaStrandA.length == dnaStrandB.length) {
            "left and right strands must be of equal length."
        }

        return dnaStrandA.zip(dnaStrandB).count { it.first != it.second }
    }
}
