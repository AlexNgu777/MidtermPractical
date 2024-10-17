package sheridancollege.ngualexa.midtermpractical.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import sheridancollege.ngualexa.midtermpractical.components.*
import sheridancollege.ngualexa.midtermpractical.data.checkAnswers
import sheridancollege.ngualexa.midtermpractical.data.mathProblems

@Composable
fun TutorApp() {
    var questions by remember { mutableStateOf(mathProblems()) }
    var answers = remember { mutableStateListOf("", "", "", "") }
    var numberOfCorrectAnswers by remember { mutableStateOf(0) }
    var numberOfWrongAnswers by remember { mutableStateOf(0) }
    var isAnswerCorrect = remember { mutableStateListOf<Boolean?>(null, null, null, null) }

    Column(modifier = Modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
        TopBar()
        MathOperations(questions = questions, answers = answers, isCorrect = isAnswerCorrect)
        Buttons(
            onCheckAnswers = {
                val (correct, wrong) = checkAnswers(questions, answers, isAnswerCorrect)
                numberOfCorrectAnswers = correct
                numberOfWrongAnswers = wrong
            },
            onGenerateNewMathProblems = {
                questions = mathProblems()
                answers.fill("")
                isAnswerCorrect.fill(null)
                numberOfCorrectAnswers = 0
                numberOfWrongAnswers = 0
            }
        )
        Results(
            numberOfCorrectAnswers = numberOfCorrectAnswers,
            numberOfWrongAnswers = numberOfWrongAnswers
        )
        Footer()
    }
}