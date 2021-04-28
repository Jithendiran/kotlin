import java.util.* // for map

fun main()
{
    var a = listOf(1,2,3,4)
    var b = listOf(1..15) // it will not work run it and understand

    for (i in a)
    println(i)

    println()

    for (i in b)
    println(i)

    println()
    

    for ((i,v) in a.withIndex())
    println("index $i : value $v")

    println()
    // map

    var m = TreeMap<String, Int>()
    m["A"]=1
    m["B"]=2

    for ((i,v) in m)
    println("Name $i : value $v")
}