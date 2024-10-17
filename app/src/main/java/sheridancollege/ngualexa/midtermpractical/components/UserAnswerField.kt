package sheridancollege.ngualexa.midtermpractical.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun UserAnswerField(answer: String, onAnswerChange: (String) -> Unit, isCorrect: Boolean?) {
    var backGroundColour = if (isCorrect == true) {
        Color.Green
    } else if (isCorrect == false) {
        Color.Red
    } else {
        Color.LightGray
    }

    BasicTextField(
        value = answer,
        onValueChange = onAnswerChange,
        modifier = Modifier.background(backGroundColour)
            .border(1.dp, Color.Black)
            .padding(5.dp)
            .fillMaxWidth(0.50.toFloat())
    )
}

