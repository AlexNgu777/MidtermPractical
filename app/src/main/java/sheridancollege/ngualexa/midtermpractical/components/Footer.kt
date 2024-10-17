package sheridancollege.ngualexa.midtermpractical.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Footer() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Student Name: Alex Nguyen");
        Text(text = "Student ID: 991753208");
    }
}