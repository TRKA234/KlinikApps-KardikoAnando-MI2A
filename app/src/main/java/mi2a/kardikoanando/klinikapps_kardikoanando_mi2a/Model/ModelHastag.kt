package mi2a.kardikoanando.klinikapps_kardikoanando_mi2a.Model

data class ModelHastag(
    var hastag : String
)

object MockList1{
    fun getModel() : List<ModelHastag>{
        val itemModel1 = ModelHastag(
            "#heart"
        )

        val itemModel2 = ModelHastag(
            "#teeth"
        )

        val itemModel3 = ModelHastag(
            "#surgeon"
        )

        val itemModel4 = ModelHastag(
            "#eyes"
        )

        val itemModel5 = ModelHastag(
            "#mounth"
        )

        val itemModel6 = ModelHastag(
            "#heart"
        )

        val itemModel7 = ModelHastag(
            "#teeth"
        )

        val itemModel8 = ModelHastag(
            "#surgeon"
        )

        val itemModel9 = ModelHastag(
            "#eyes"
        )

        val itemModel10 = ModelHastag(
            "#mounth"
        )


        val itemList : ArrayList<ModelHastag> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        itemList.add(itemModel9)
        itemList.add(itemModel10)

        return itemList
    }
}