package ferium.anejvaupotic.kcal_counter

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import kotlin.coroutines.CoroutineContext

class AppManager: Application() {
    private val api = "http://sipv.gorecan.com:11111/api/v1/"
    val mk = "text/x-markdown; charset=utf-8".toMediaType()
    val client = OkHttpClient()
    lateinit var credentials: SharedPreferences

    override fun onCreate() {
        super.onCreate()
        credentials = getSharedPreferences("kcal_counter_creds", Context.MODE_PRIVATE)
    }

    fun authorize(): Boolean {
        val key = credentials.getString("ApiKey",null)
        if(!key.equals(null))
            // do the api call
            print("sicc")
        return false
    }

    fun login(userName: String, password: String): Boolean {
        val postData = "uname:"+userName+"\npassw:"+password
        val req = Request.Builder()
                .url(api + "auternticate")
                .post(postData.toRequestBody((mk)))
                .build()

        //add response andling
        return true
    }

    fun register() {
        val postData = "uname:"+userName+"\npassw:"+password
        val req = Request.Builder()
                .url(api + "auternticate")
                .post(postData.toRequestBody((mk)))
                .build()
    }
}