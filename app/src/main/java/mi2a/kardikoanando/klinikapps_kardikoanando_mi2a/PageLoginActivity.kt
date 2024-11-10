package mi2a.kardikoanando.klinikapps_kardikoanando_mi2a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLoginActivity : AppCompatActivity() {

    private  lateinit var txtSigUp : TextView
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)

        txtSigUp = findViewById(R.id.txtSignUp)
        btnLogin = findViewById(R.id.btnLogin)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtSigUp.setOnClickListener(){
            val intent= Intent(this@PageLoginActivity, PageRegisterActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener(){
            val intent = Intent(this@PageLoginActivity, PageDisplayListActivity::class.java)
            startActivity(intent)
        }
    }
}