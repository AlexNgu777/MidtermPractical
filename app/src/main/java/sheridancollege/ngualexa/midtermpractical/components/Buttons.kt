package sheridancollege.ngualexa.midtermpractical.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Buttons() {
    var answers by remember { mutableStateOf(listOf<String>()) }
    var correctAnswers by remember { mutableStateOf(listOf<String>()) }
    var wrongAnswers by remember { mutableStateOf(listOf<String>()) }
    Row(modifier = Modifier.fillMaxWidth()) {
//        Button(onClick = { unit }) {
//            Text(text = "Generate new Math Problems")
//        }
//
//        Button(onClick = { unit }) {
//            Text(text = "Check Answers")
//        }
    }
}