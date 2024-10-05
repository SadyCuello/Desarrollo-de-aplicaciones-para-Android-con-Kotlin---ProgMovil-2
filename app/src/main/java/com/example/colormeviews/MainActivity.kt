package com.example.colormeviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.example.colormeviews.ui.theme.ColorMeViewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners() {

        val boxOneText = findViewById<View>(R.id.box_one_text)
        val boxTwoText = findViewById<View>(R.id.box_two_text)
        val boxThreeText = findViewById<View>(R.id.box_three_text)
        val boxFourText = findViewById<View>(R.id.box_four_text)
        val boxFiveText = findViewById<View>(R.id.box_five_text)
        val constraintLayout = findViewById<View>(R.id.Constraint_Layout)
        val redButton = findViewById<View>(R.id.red_button)
        val yellowButton = findViewById<View>(R.id.yellow_button)
        val greenButton = findViewById<View>(R.id.green_button)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, constraintLayout, redButton,yellowButton, greenButton)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored (view: View){
        when (view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundColor(
                ContextCompat.getColor(this, android.R.color.holo_green_light)
            )
            R.id.box_four_text -> view.setBackgroundColor(
                ContextCompat.getColor(this, android.R.color.holo_green_dark)
            )
            R.id.box_five_text -> view.setBackgroundColor(
                ContextCompat.getColor(this, android.R.color.holo_green_light)
            )
            R.id.red_button -> view.setBackgroundColor(
                ContextCompat.getColor(this, R.color.my_red)
            )
            R.id.yellow_button -> view.setBackgroundColor(
                ContextCompat.getColor(this, R.color.my_yellow)
            )
            R.id.green_button -> view.setBackgroundColor(
                ContextCompat.getColor(this, R.color.my_green)
            )


            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ColorMeViewsTheme {
        Greeting("Android")
    }
}