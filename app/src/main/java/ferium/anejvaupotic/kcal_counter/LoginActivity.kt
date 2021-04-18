package ferium.anejvaupotic.kcal_counter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    lateinit var app: AppManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        app = application as AppManager
        //add listenerf sor empty
        val usernameField = findViewById<TextView>(R.id.inp_username)
        val passwordField = findViewById<TextView>(R.id.inp_passowrd)

        findViewById<Button>(R.id.btn_log).setOnClickListener {
            app.login(usernameField.text.toString(), passwordField.text.toString())
            //send api call
            //util spellcheck func
        }

        findViewById<Button>(R.id.btn_register).setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}