package pt.iade.ei.android_studio_pm_task

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import pt.iade.ei.android_studio_pm_task.menus.FeaturedItemsMenu
import pt.iade.ei.android_studio_pm_task.ui.theme.AndroidstudioPMtaskTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidstudioPMtaskTheme {
                FeaturedItemsMenu()
            }
        }
    }
}