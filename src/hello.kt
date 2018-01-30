
fun main(args : Array<String> )
{
    println("hello")
    var emp = employee()
    println("Name: "+ emp.name)

    var dpt = Dpt();
    dpt.name = "SE";
    println("Dept Name is: "+ dpt.name)

    var dpt1 = Dpt();
    dpt1.name = "Abc";
    println("Name is: "+ dpt1.name);
}