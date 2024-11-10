package mi2a.kardikoanando.klinikapps_kardikoanando_mi2a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StarterPageActivity : AppCompatActivity() {

    private lateinit var btnGetstarted : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_starter_page)

        btnGetstarted = findViewById(R.id.btnGetstarted)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnGetstarted.setOnClickListener(){
            val intent = Intent(this@StarterPageActivity , PageLoginActivity::class.java)
            startActivity(intent)
        }
    }
}