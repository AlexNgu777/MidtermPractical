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
fun MathOperations() {
    var answer1 by remember { mutableStateOf(TextFieldValue("")) }
    var answer2 by remember { mutableStateOf(TextFieldValue("")) }
    var answer3 by remember { mutableStateOf(TextFieldValue("")) }
    var answer4 by remember { mutableStateOf(TextFieldValue("")) }

    Column() {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "")
            Text(text = "")
            Text(text = "")
            TextField(value = answer1,
                onValueChange = {answer1 = it})
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "")
            Text(text = "")
            Text(text = "")
            TextField(value = answer2,
                onValueChange = {answer2 = it})
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "")
            Text(text = "")
            Text(text = "")
            TextField(value = answer3,
                onValueChange = {answer3 = it})
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "")
            Text(text = "")
            Text(text = "")
            TextField(value = answer4,
                onValueChange = {answer4 = it})
        }
    }

}