package pt.iade.ei.android_studio_pm_task.ui.theme.components

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iade.ei.android_studio_pm_task.ContentDetailActivity
import pt.iade.ei.android_studio_pm_task.information.contentItemListInformation
import pt.iade.ei.android_studio_pm_task.models.ContentItem


@Composable
fun RatedContentListItem(
    item: ContentItem
) {
    val context = LocalContext.current
    Card(
        modifier = Modifier.padding(
            vertical = 10.dp,
            horizontal = 5.dp
        ),
        onClick = {
            val intent = Intent(context, ContentDetailActivity::class.java)
            intent.putExtra("item", item)
            context.startActivity(intent)
        }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)
        ) {
            ContentVote(item)
            Image(
                painter = painterResource(id = item.cover),
                contentDescription = "Black Clover Banner",
                modifier = Modifier
                    .height(120.dp)
                    .aspectRatio(2f / 3f)
                    .clip(MaterialTheme.shapes.extraSmall),
                contentScale = ContentScale.Crop,
            )
            Column(
                modifier = Modifier.padding(
                    start = 10.dp
                )
            ) {
                Text(
                    text = item.title,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 16.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = item.description,
                    maxLines = 2,
                    minLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                ReviewStars(item)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RatedContentListItemPreview() {
    RatedContentListItem(
        contentItemListInformation().first()
    )
}