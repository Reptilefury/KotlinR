fun main(args: Array<String>) {
  fun add (a:Int, b:Int): Int{
      return a + b
  }
    var function = ::add
    function(4,2)
}
