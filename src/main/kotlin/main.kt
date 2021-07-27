fun main(args: Array<String>) {
fun displaMessage(msg: String, count: Int): Int {
    var counter = 1
    while (counter++ <= count){
       println(msg)
    }
    displaMessage("hello", 40)
    println(msg)
    return counter
}


}
