open class living1(name:String)
{
    init
    {
        println("Inside living1 it is super class")
        println("name is :"+name)
    }
    open fun eat()
    {
        println("it can eat")
    }

    open fun sleep()
    {
        println("it can sleep")
    }

}

class living2 (name:String): living1(name) // it pass value to super
{
    init
    {
        println("It is sub class it get name and pass name")
    }
}

fun main()
{
    var obj = living2("Name passed") // it get value
    obj.sleep()
}