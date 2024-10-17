package sheridancollege.ngualexa.midtermpractical.data

import kotlin.random.Random

var operations = listOf<String>("*","+","-")
var questions = mutableListOf<String>()
var correctAnswers = mutableListOf<String>()
var wrongAnswers = mutableListOf<String>()


fun mathProblems(): List<String> {
    for (i in 0..4) {
        var number1 = Random.nextInt(1,100)
        var number2 = Random.nextInt(1,100)
        var operation = operations.random()
        var question = "$number1 $operation $number2"
        questions[i] = question
    }
    return questions
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
    } else {
        return (number1 - number2);
    }
}
fun checkAnswers(questions: List<String>, answers: List<String>) {
    questions.forEachIndexed { index, question ->
        val checkAnswer = solveQuestion(question)
        if(answers[index].toInt() == checkAnswer) {
            correctAnswers.add(answers[index])
        } else {
            wrongAnswers.add(answers[index])
        }
    }
}



