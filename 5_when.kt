// when is switch in other language like c,java...file
// it use -> instead of :
// it don't have break
// no case key word
// else is default


fun main() 
{
    val c = 15;
    var str = when (c) 
    {
        1 -> "one"
        2 -> "two"
        3->"three"
        4,5-> " 4 or 5"
        in 9..20-> "range from 9 .. 20"
        else -> "it is default "

    }

    println(str)
    when ("e") 
    {
       "aa" -> println("aa")
        "bb" -> println("bb")
        "cc"-> println("cc")
        in "a..g"-> println("a to e")
        //1->println(1) error all must same type
        
        else -> println("it is default")

    }

}