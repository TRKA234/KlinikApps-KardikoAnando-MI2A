package mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Model

import mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.R

data class ModelDokter(
    var gambar : Int,
    var nama_dokter : String,
    var spesialis : String,
    var review : String,
    var nilai : String
)
object MockList2{
    fun getModel() : List<ModelDokter>{
        val itemModel1 = ModelDokter(
            R.drawable.dokter3,
            "Dr.Floyd Miles",
            "Pediatrics",
            "(123 reviews)",
            "4.9"
        )

        val itemModel2 = ModelDokter(
            R.drawable.dokter8,
            "Dr. Guy Hawkins",
            "Dentist",
            "(85 reviews)",
            "4.9"
        )

        val itemModel3 = ModelDokter(
            R.drawable.dokter9,
            "Dr. Jane Cooper",
            "Cardiologist",
            "(44 reviews)",
            "4.7"
        )

        val itemModel4 = ModelDokter(
            R.drawable.dokter10,
            "Dr. Jacob Jones",
            "Nephrologyst",
            "(101 reviews)",
            "5.0"
        )

        val itemModel5 = ModelDokter(
            R.drawable.dokter11,
            "Dr. Savannah Nguyen",
            "Urologyst",
            "(168 reviews)",
            "4.8"
        )

        val itemModel6 = ModelDokter(
            R.drawable.dokter3,
            "Dr.Floyd Miles",
            "Pediatrics",
            "(123 reviews)",
            "4.9"
        )

        val itemModel7 = ModelDokter(
            R.drawable.dokter8,
            "Dr. Guy Hawkins",
            "Dentist",
            "(85 reviews)",
            "4.9"
        )

        val itemModel8 = ModelDokter(
            R.drawable.dokter9,
            "Dr. Jane Cooper",
            "Cardiologist",
            "(44 reviews)",
            "4.7"
        )

        val itemModel9 = ModelDokter(
            R.drawable.dokter10,
            "Dr. Jacob Jones",
            "Nephrologyst",
            "(101 reviews)",
            "5.0"
        )

        val itemModel10 = ModelDokter(
            R.drawable.dokter11,
            "Dr. Savannah Nguyen",
            "Urologyst",
            "(168 reviews)",
            "4.8"
        )

        val itmList : ArrayList<ModelDokter> = ArrayList()
        itmList.add(itemModel1)
        itmList.add(itemModel2)
        itmList.add(itemModel3)
        itmList.add(itemModel4)
        itmList.add(itemModel5)
        itmList.add(itemModel6)
        itmList.add(itemModel7)
        itmList.add(itemModel8)
        itmList.add(itemModel9)
        itmList.add(itemModel10)

        return itmList
    }

}