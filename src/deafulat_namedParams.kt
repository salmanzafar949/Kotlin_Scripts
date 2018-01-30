@file:JvmName("Calculateintrest")

fun main(args : Array<String>)
{
          println(cal_intrest(40))
          println(cal_intrest(amount = 45, intrest = 1.02))
}

// will create two methods one with intrest and one without intrest
@JvmOverloads
fun cal_intrest(amount : Int, intrest : Double = 0.04): Int
{
    return (amount + amount * intrest).toInt()
}