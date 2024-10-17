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

fun checkAnswers(questions: List<String>, answers: List<String>) {
    
}