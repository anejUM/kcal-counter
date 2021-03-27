package ferium.anejvaupotic.kcal_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<Button>(R.id.btn_conf).setOnClickListener {
            //API call to register user
            //auth succ -> return
            //auth fail -> 502
            //wrong info util spellcheck
        }
    }
}