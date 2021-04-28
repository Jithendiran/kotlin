// while , do while, for
fun main() 
{
    var a = 1..6
    for(i in a)
    println(i)

    for (i in a step 2)
    println(i)

    // for reverse loop

    /*
    for(i in 16..1)         // no error it will not work
    println(i)
    */

    for( i in 16 downTo 1)
    println(i)          // print 16 to 1

    // downto is a method of int 16.downTo(1) for readable it is 16 downTo 1

    // 1 until 16  // it will print upto 15
    for( i in 1 until 8)
    println(i)
}