package mi2a.kardikoanando.klinikapps_kardikoanando_mi2a

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageRegisterActivity : AppCompatActivity() {

    private  lateinit var txtsigin : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_register)

        txtsigin = findViewById(R.id.txtsignin)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtsigin.setOnClickListener(){
            val intent = Intent(this@PageRegisterActivity,PageLoginActivity::class.java)
            startActivity(intent)
        }

    }
}