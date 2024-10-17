package sheridancollege.ngualexa.midtermpractical.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue



@Composable
fun MathProblemsSection(questions: List<String>, answers: MutableList<String>) {
    Column {
        questions.forEachIndexed { index, question ->
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = question)
                UserAnswerField(
                    answer = questions[index],
                    onAnswerChange = { answers[index] = it }
                )
            }
        }
    }
}