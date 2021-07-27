import sun.rmi.runtime.Log

fun main(args: Array<String>) {
    fun orderProduct(
        giftWrap: Boolean = false,
        product: String,
        postalService: String = "Standard"
    ) {
   var details: String = ""
        if(giftWrap){
            details += "Gift Wrapped"
        }
        details += "$product"
        details += "by $postalService postage"
        Log.i("Product details", details)
    }
    orderProduct(product = "Beer")
    orderProduct(true,  "porsche")
    orderProduct(true,  "Barbie(Jet-Set Edition)","Next Day")
    orderProduct(product ="Flat-pack bookcase",
    postalService = "Carrier Pigeon"
        )

}
