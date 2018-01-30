fun main(args: Array<String>)
{
    add(4,5)
    println(divide(4,2))
    println(mult(4,5))
    println(max(4,5))
}

// simple function

fun add(a : Int, b : Int)
{
  println(a + b)
}

// function with return values

fun divide(a : Int, b : Int): Int {
    return a/b
}

// Inline functions

fun mult (a : Int, b : Int):Int=a*b

fun max(a :Int, b : Int):Int = if(a>b){ a }else{ b }