data class Lap(var name: String,var price:Int)
{
    fun show()
    {
        println("Name :"+name+" Price:"+price)
    }
}

fun main()
{
    var obj1 = Lap("Hp",58000)
    var obj2 = Lap("Hp",58000)

    println(obj1 == obj2) // if data is not given it will compare object hase and give false now it compare object's data

    var obj3 = obj1.copy() // it only possible bcz of data
    println(obj3)

    var obj4 = Lap("Asus",50000)
    println(obj3 == obj4)
}