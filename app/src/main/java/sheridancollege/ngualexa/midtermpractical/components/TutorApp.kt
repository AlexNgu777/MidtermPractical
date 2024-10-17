package sheridancollege.ngualexa.midtermpractical.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import sheridancollege.ngualexa.midtermpractical.components.*
import sheridancollege.ngualexa.midtermpractical.data.checkAnswers
import sheridancollege.ngualexa.midtermpractical.data.mathProblems

@Composable
fun TutorApp() {
    var questions by remember { mutableStateOf(mathProblems()) }
    var answers = remember { mutableStateListOf("","","","") }
    var correctAnswers by remember { mutableStateOf(listOf<String>()) }
    var wrongAnswers by remember { mutableStateOf(listOf<String>()) }

    Column(modifier = Modifier.fillMaxHeight()) {
        TopBar()
        MathOperations(questions = questions, answers = answers)
        Buttons(onCheckAnswers = {
            checkAnswers(questions, answers)
        }, onGenerateNewMathProblems = {
            questions = mathProblems()
            answers.fill("")
        })

        Results()


        Footer()
    }
}