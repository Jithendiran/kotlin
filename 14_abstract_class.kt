// same like java

abstract class Ab
{
    abstract fun think()

    fun func()
    {
        println("Inside abstract")
    }
}

class bc:Ab()
{
    override fun think() 
    {
            println("In think")
    }
}

fun main()
{
    var obj:Ab = bc() //object of bc reference of Ab like java
    obj.think()
    obj.func()

    var obj1 = bc() //object of bc 
    obj1.think()
    obj1.func()
}