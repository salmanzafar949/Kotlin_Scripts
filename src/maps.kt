import java.util.*

fun main(args : Array<String>)
{
    var map = TreeMap<String,Int>()
    map["salman"] = 23
    map["abc"]  = 40

    for ((name,age) in map)
    {
        println("$name : $age")
    }
}