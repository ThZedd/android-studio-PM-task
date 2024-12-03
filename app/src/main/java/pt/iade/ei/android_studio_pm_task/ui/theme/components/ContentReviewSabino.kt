package pt.iade.ei.android_studio_pm_task.ui.theme.components

import pt.iade.ei.android_studio_pm_task.R

import pt.iade.ei.android_studio_pm_task.models.Review
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iade.ei.android_studio_pm_task.information.contentReviewInformationList

//Decidi fazer a Review estilo Google PlayStore Espero que o profesor não se importe com isso

@Composable
fun ContentReviewSabino(review: Review){
    HorizontalDivider(
        thickness = 1.dp,
    )
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 5.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.review_profile),
                contentDescription = "User profile picture",
                modifier = Modifier
                    .padding(start = 5.dp, end = 10.dp)
                    .height(70.dp)
                    .aspectRatio(1f)
                    .clip(shape = RoundedCornerShape(100))
            )
            Text(
                modifier = Modifier.padding(bottom = 2.dp, top = 25.dp),
                text = review.user.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
        ) {
            Stars(rating = review.rating.toFloat(), size = 25.dp)

        }
        Text(
            modifier = Modifier.padding(top = 4.dp, start = 10.dp, bottom = 10.dp, end = 10.dp),
            text = review.comment,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        )
    }   }


@Preview(showBackground = true)
@Composable
fun ContentReviewSabinoPreview(){
    ContentReviewSabino(contentReviewInformationList().first())
}