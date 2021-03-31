package ferium.anejvaupotic.kcal_counter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.btn_prof).setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }

        findViewById<Button>(R.id.btn_add_food).setOnClickListener {
            startActivity(Intent(this,FoodActivity::class.java))
        }
    }
}