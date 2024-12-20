package pt.iade.ei.android_studio_pm_task.menus


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import pt.iade.ei.android_studio_pm_task.information.contentItemListInformation
import pt.iade.ei.android_studio_pm_task.models.ContentItem
import pt.iade.ei.android_studio_pm_task.ui.theme.components.ContentMovie
import pt.iade.ei.android_studio_pm_task.ui.theme.components.ContentReviewSabino


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailMenu(
    item: ContentItem,
    onClickBack: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(item.title)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        onClickBack()
                    }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                },
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            item {
                Image(
                    painter = painterResource(id = item.banner),
                    contentDescription = "Black Clover Banner",
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16f / 9f),
                    contentScale = ContentScale.Crop
                )
            }

            item {
                ContentMovie(item)
            }

            items(item.reviews){ review ->
                ContentReviewSabino(review)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailMenuPreview() {
    DetailMenu(
        contentItemListInformation().first()
    )
}