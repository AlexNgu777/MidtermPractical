package sheridancollege.ngualexa.midtermpractical.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Buttons(onCheckAnswers: () -> Unit, onCreateNewQuestions: () -> Unit) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Button(onClick = onCreateNewQuestions) {
            Text(text = "Generate new Math Problems")
        }
        Button(onClick = onCheckAnswers) {
            Text(text = "Check Answers")
        }
    }
}