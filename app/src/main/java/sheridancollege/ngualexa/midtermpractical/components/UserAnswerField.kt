package sheridancollege.ngualexa.midtermpractical.components

import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@Composable
fun UserAnswerField(answer: String, onAnswerChange: (String) -> Unit) {
    TextField(
        value = answer,
        onValueChange = onAnswerChange,
    )
}