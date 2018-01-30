fun main(args : Array<String>)
{
    //will print values from 1 to 5
   var num = 1 .. 5

    for (a in num)
    {
           println("$a")
    }

    // will print values in desc order from 100 to 10
    var dec = 100 downTo 10

    for (b in dec)
    {
        println(b)
    }

    // will print va;ues till 15
    var unt = 1 until 16
    for (c in unt)
    {
        println(c)
    }

    // different Method in Kotlin

    //Count will count number of elements

    println(num.count())

    // recvered will reversed the num order

    println(num.reversed())


    //printing abc form A to small z
    val Aplphabets = 'A'..'z'

    for (abc in Aplphabets)
    {
        println("$abc")
    }
}