fun main(args : Array<String>)
{
    var str : String = "33"
    var num : Int = 0 ;

    try {
        num = str.toInt()
    }
    catch (e : NumberFormatException)
    {
        println("Give Proper Input")
    }
    finally
    {
        num++
        print(num);
    }


}