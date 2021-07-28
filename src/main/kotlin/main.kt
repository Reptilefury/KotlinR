/*
import sun.rmi.runtime.Log

fun main(args: Array<String>) {
    class Person(val name: String, var weightLbs: Double) {
        fun eatDessert(addedIcream: Boolean = true) {
         weightLbs += if (addedIcream) 4.0 else 2.0
        }
        fun calcGoalWeight(weightToLoose: Double): Double {
           return weightLbs - weightToLoose
        }
        val p = Person("John Doe", 170.0)
        p.eatDessert(true)
        val lbs = p.weightLbs
        p.eatDessert()
        lbs = p.weightLbs
        val gw = p.calcGoalWeight()


    }
}
*/
fun main(args:Array<String>){
    var map = HashMap<Int, String>()
    map.put(213,"Jenna")
    map.put(41,"Lena")
    map.put(32,"Seehaus")
    map.put(46,"Farz")

    println(map.get(213))
    println(map.get(41))
    println(map.get(32))
    println(map.get(46))
    for(k in map.keys){
        println(map.get(k))
    }


}

