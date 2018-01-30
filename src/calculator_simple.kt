fun main (args : Array<String>)
{

    val op : String = "+"

    when(op)
    {
        "+" -> println(add(5,10))
        "-" -> println(sub(10,5))
        "/" -> println(div(10,5))
        "*" -> println(mutl(10,10))
        else -> println("Inavlid operation")
    }
}

//fun add(a : Int, b : Int):Int
//{
//    return a + b
//}

fun sub(a : Int, b : Int):Int
{
    return a - b
}

fun div(a : Int, b : Int):Int
{
    return a / b
}

fun mutl(a : Int, b : Int):Int
{
    return a * b
}





