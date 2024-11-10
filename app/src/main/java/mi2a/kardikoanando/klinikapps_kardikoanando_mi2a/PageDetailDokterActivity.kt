package mi2a.kardikoanando.klinikapps_kardikoanando_mi2a

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageDetailDokterActivity : AppCompatActivity() {

    private lateinit var imgDetailDocter: ImageView
    private lateinit var txtDetailNamaDokter: TextView
    private lateinit var txtDetailSpesialis : TextView
    private lateinit var txtDetailReview : TextView
    private lateinit var txtDetailNilai : TextView
    private lateinit var txtback : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_detail_dokter)

        imgDetailDocter = findViewById(R.id.imgDetailDokter)
        txtDetailNamaDokter = findViewById(R.id.txtDetailNamaDokter)
        txtDetailSpesialis = findViewById(R.id.txtDetailSpesialis)
        txtDetailReview = findViewById(R.id.txtDetailReview)
        txtDetailNilai = findViewById(R.id.txtDetailNilai)
        txtback = findViewById(R.id.txtBack)

        val detailImg = intent.getIntExtra("gambar",0)
        val detailNama = intent.getStringExtra("nama_dokter")
        val detailSpesialis = intent.getStringExtra("spesialis")
        val detailReview = intent.getStringExtra("review")
        val detailNilai = intent.getStringExtra("nilai")

        imgDetailDocter.setImageResource(detailImg)
        txtDetailNamaDokter.setText(detailNama)
        txtDetailSpesialis.setText(detailSpesialis)
        txtDetailReview.setText(detailReview)
        txtDetailNilai.setText(detailNilai)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtback.setOnClickListener(){
            val intent = Intent(this@PageDetailDokterActivity,PageDisplayListActivity::class.java)
            startActivity(intent)
        }

    }
}