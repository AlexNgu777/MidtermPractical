package sheridancollege.ngualexa.midtermpractical.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TransformedText

@Composable
fun Results() {
    var correctAnswers by remember { mutableStateOf(listOf<String>()) }
    var wrongAnswers by remember { mutableStateOf(listOf<String>()) }
    var joinedCorrectAnswers = correctAnswers.joinToString(", ")
    var joinedWrongAnswers = wrongAnswers.joinToString(", ")
    Row(modifier = Modifier.fillMaxWidth()) {
        Column {
            Text(text = "Correct Answers: ${joinedCorrectAnswers} ")
            Text(text = "Incorrect Answers: ${joinedWrongAnswers}")
        }
    }
}