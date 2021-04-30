// it not have multiple inheritance
// all class,method in kotlin are final not public use open to allow inheritance

open class living
{
    open fun eat()
    {
        println("it can eat")
    }

    open fun sleep()
    {
        println("it can sleep")
    }

}

class human : living()  // use ':' for extend in java
{
    fun think()
    {
        println("can think")
    }
}

class bird : living()
{
    // override method in super class that method must be open
    
    override fun eat()
    {
        println("Bird eat ")
    }
    fun fly()
    {
        println("Bird can fly")
    }
}

fun main()
{
    var obj = human()

    obj.eat()       // calling parent class method
    obj.sleep()     // calling parent class method
    obj.think()     // calling this class method

    var biobj = bird()
    biobj.eat()     // it call override method
    biobj.sleep()   // it call parent method
    biobj.fly()     // it call it's method

}