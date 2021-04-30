// same as java 
// no seprate symbol for implementing interface same ':' for implementing
interface A1
{
    fun hi()  // by default it is 'abstract fun hi()' like java
    fun abc()
    fun def()
    {
        println("Inside def in A1")   
    }
}

interface A2 
{
    fun ji()
    fun hi() 
    fun abc()   // no error 
    fun def()
    {
        println("Inside def in A2")   
    }

}

class A3:A1,A2
{
    override fun hi()           
    {
        println("Implemented by hi")
    }
    override fun ji()
    {
        println("Implemented by ji")
    }
    override fun abc()
    {
        println("Implemented by dont know i suspect from A1 bcz :A1,A2 A1 is 1st")
    }
    override fun def()
    {
        println("Inside def in A3")   
        //to call A1 def
        super<A1>.def() // it call def of A1
        super<A2>.def() // it call def of A2
    }
}

fun main()
{
    var obj = A3()
    obj.hi()
    obj.ji()
    obj.abc()
    obj.def()

    var obj1:A1 = A3()
    obj1.hi()
    //obj1.ji()     // it is not possible , because it has only A1 reference
    obj1.abc()      // it abc confirmly implemented by A1 bcz it has the reference of A1
    obj1.def()      // # i don't konw how it call def of A2
}