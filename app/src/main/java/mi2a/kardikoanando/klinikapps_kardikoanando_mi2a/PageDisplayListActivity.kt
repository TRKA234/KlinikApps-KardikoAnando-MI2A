package mi2a.kardikoanando.klinikapps_kardikoanando_mi2a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Adapter.AdapterDokter
import mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Adapter.AdapterHastag
import mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Adapter.AdapterIcon
import mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Model.MockList
import mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Model.MockList1
import mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Model.MockList2
import mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Model.ModelDokter
import mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Model.ModelHastag
import mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Model.ModelIcon

class PageDisplayListActivity : AppCompatActivity() {

    private lateinit var rv_hastag : RecyclerView
    private lateinit var rv_icon : RecyclerView
    private lateinit var rv_dokter : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_display_list)

        rv_hastag = findViewById(R.id.rv_hastag)
        rv_icon = findViewById(R.id.rv_icon)
        rv_dokter = findViewById(R.id.rv_dokter)

        ///recycle view hastag
        rv_hastag.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        val adapter = AdapterHastag(MockList1.getModel() as ArrayList<ModelHastag>,this)
        rv_hastag.adapter = adapter

        rv_hastag.layoutManager?.scrollToPosition(0)

        ///recyle view icon
        rv_icon.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        val adapter1 = AdapterIcon(MockList.getModel() as ArrayList<ModelIcon>,this)
        rv_icon.adapter = adapter1

        rv_icon.layoutManager?.scrollToPosition(0)

        //recycle view dokter
        rv_dokter.layoutManager = GridLayoutManager(this, 1)
        val adapter2 = AdapterDokter(MockList2.getModel() as ArrayList<ModelDokter>, this)
        rv_dokter.adapter = adapter2

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}