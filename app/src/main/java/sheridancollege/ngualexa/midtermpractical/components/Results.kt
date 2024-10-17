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
fun Results(numberOfCorrectAnswers: Int, numberOfWrongAnswers: Int) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Column {
            Text(text = "Correct Answers: ${numberOfCorrectAnswers} ")
            Text(text = "Incorrect Answers: ${numberOfWrongAnswers}")
        }
    }
}