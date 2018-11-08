enum class Signal {
    WINK,
    DOUBLE_BLINK,
    CLOSE_YOUR_EYES,
    JUMP
}

object HandshakeCalculator {
    fun calculateHandshake(handshake: Int): List<Signal> {
        val signalsBuffer = mutableListOf<Signal>()

        if (handshake and 0b1 != 0) signalsBuffer.add(Signal.WINK)
        if (handshake and 0b10 != 0) signalsBuffer.add(Signal.DOUBLE_BLINK)
        if (handshake and 0b100 != 0) signalsBuffer.add(Signal.CLOSE_YOUR_EYES)
        if (handshake and 0b1000 != 0) signalsBuffer.add(Signal.JUMP)

        if (handshake and 0b10000 != 0) signalsBuffer.reverse()

        return signalsBuffer;
    }
}
