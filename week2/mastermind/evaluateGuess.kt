package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    var matchCount = 0
    var wrongPos = 0

    mapOf<Int, Char>()

    return Evaluation(0, 0)
}
