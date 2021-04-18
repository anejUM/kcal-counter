package ferium.anejvaupotic.kcal_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class RegisterActivity : AppCompatActivity() {
    lateinit var app: AppManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        app = application as AppManager

        //findViewById<TextView>(R.id.inp_first_name).addTextChangedListener {}
        //findViewById<TextView>(R.id.inp_last_name)
        //findViewById<TextView>(R.id.inp_email)
        findViewById<Button>(R.id.btn_conf).setOnClickListener {
            //API call to register user
            //auth succ -> return
            //auth fail -> 502
            //wrong info util spellcheck
        }
    }
}