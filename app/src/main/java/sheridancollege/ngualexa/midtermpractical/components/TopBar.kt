package sheridancollege.ngualexa.midtermpractical.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TopBar() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(text="Grade 4 Math Tutor")
    }

}
