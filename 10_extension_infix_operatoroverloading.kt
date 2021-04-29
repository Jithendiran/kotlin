//Extension class

class A
{
    var a:Int = 0
    var name:String=""
    fun give()
    {
        println(a)
    }
}
 
fun main()
{
    var o = A()
    o.foo(6)
    o.give()
    o.name="ji"
    var s = o inf "jidesh"  //calling infix function  obj function_name parameter

    println(s)
    var o1 = A()
    o1.name="hi"
    s = o + o1              // calling operator overloading plus
    println(s)

}

fun A.foo(n: Int)
{
    a=n;       //this function is part of a class
}


//infix 

infix fun A.inf(n:String):String            //it must have single argument
{
    return this.name+" "+n;
}


//operator overloading

operator infix fun A.plus(n:A ):String   //use keyword operator
{
    return this.name+" "+n.name;
}