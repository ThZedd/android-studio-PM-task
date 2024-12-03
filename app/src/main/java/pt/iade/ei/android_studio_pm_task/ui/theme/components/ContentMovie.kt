package pt.iade.ei.android_studio_pm_task.ui.theme.components


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import pt.iade.ei.android_studio_pm_task.information.contentItemListInformation

import pt.iade.ei.android_studio_pm_task.models.ContentItem
import java.time.format.DateTimeFormatter

@SuppressLint("DefaultLocale")
@Composable
fun ContentMovie(
    item: ContentItem
) {
    Column(
        modifier = Modifier.padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.padding(bottom = 15.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = item.genre,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )

        }
        Text(
            text = item.releaseDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            modifier = Modifier.padding(bottom = 15.dp)
        )
        Text(
            modifier = Modifier.padding(bottom = 15.dp),
            text = item.description,
            fontSize = 16.sp,
        )
        val hours = item.duration / 60
        val hoursString = if (hours > 0) "${hours}h" else ""
        val minutes = item.duration % 60
        val minutesString = if (minutes > 0) "${minutes}m" else ""
        Text(
            modifier = Modifier.padding(bottom = 25.dp),
            text = "$hoursString $minutesString",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Stars(item.reviewsAverage())
            Text(
                modifier = Modifier.padding(start = 8.dp),
                fontWeight = FontWeight.Bold,
                text = String.format("%.1f", item.reviewsAverage()),
                fontSize = 22.sp
            )

            Spacer(Modifier.weight(1f))

            Text(
                modifier = Modifier.weight(1f),
                text = item.reviews.size.toString() + " reviews",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContentMoviePreview() {
    ContentMovie(
        contentItemListInformation().first()
    )
}