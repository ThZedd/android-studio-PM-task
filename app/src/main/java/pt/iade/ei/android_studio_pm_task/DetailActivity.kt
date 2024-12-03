package pt.iade.ei.android_studio_pm_task


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import pt.iade.ei.android_studio_pm_task.menus.DetailMenu
import pt.iade.ei.android_studio_pm_task.models.ContentItem
import pt.iade.ei.android_studio_pm_task.ui.theme.AndroidstudioPMtaskTheme


class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val item: ContentItem = intent.getSerializableExtra("item") as ContentItem
            AndroidstudioPMtaskTheme {
                DetailMenu(item = item){
                    finish()
                }
            }
        }
    }
}