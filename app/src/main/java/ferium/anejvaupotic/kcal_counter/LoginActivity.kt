package ferium.anejvaupotic.kcal_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.btn_log).setOnClickListener {
            //send api call
            //util spellcheck func
        }

        findViewById<Button>(R.id.btn_reg).setOnClickListener {
            //intent -> activity register
        }
    }


}