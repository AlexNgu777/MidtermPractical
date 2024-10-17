package sheridancollege.ngualexa.midtermpractical.data

import kotlin.random.Random

var operations = listOf<String>("*","+","-")
var questions = mutableListOf<String>()


fun mathProblems(): List<String> {
    val operations = listOf("*", "+", "-")
    return List(4) {
        val number1 = Random.nextInt(1, 100)
        val number2 = Random.nextInt(1, 100)
        val operation = operations.random()
        "$number1 $operation $number2"
    }
}

fun solveQuestion(question: String): Int {
    var values = question.split(" ")
    val number1 = values[0].toInt()
    val number2 = values[2].toInt()
    val operation = values[1]

    if (operation == "*") {
        return (number1 * number2);
    } else if (operation == "+") {
        return (number1 + number2);
    } else if(operation == "-") {
        return (number1 - number2);
    } else {
        return 0;
    }
}
fun checkAnswers(questions: List<String>, answers: List<String>, correctness: MutableList<Boolean?>): List<Int> {
    var correctAnswers = 0
    var wrongAnswers = 0
    questions.forEachIndexed{ index, question ->
        var correctAnswer = solveQuestion(question)
        var userAnswer = answers[index].toInt()

        if(userAnswer == correctAnswer)  {
            correctAnswers++
            correctness[index] = true

        } else {
            wrongAnswers++
            correctness[index] = false
        }
    }

    return listOf(correctAnswers, wrongAnswers)
}



