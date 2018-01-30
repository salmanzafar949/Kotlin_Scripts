fun main(args : Array<String>)
{

    var num = listOf(1,2,3)
//    println(num)
    for (i in num)
    {
        println(i)
    }

    // printing indexes and elements
    var num1 = listOf(1,2,3,4)
    for ((a,b) in  num1.withIndex())
    {
        println("$a : $b")
    }
}