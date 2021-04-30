fun main()
{
    var a = listOf<Int>(8,9,4,5) //it is read-only list

    for (i in a)
    println(i)

    println("value at 2 :"+a[2])
    println("index of 4 : "+a.indexOf(4))

    println("mutableList")
    var b = mutableListOf<Int>(2,5,6,7)
    for (i in b)
    println(i)

    println("value at 2 :"+b[2])
    println("index of 4 : "+b.indexOf(5))

    b.add(8) // it will add at last
    println("after add 8")
    for (i in b)
    println(i)

    println("after add 1 in 2")
    b.add(2,1) // 1 will add in position 2 other are shited
    for (i in b)
    println(i)

    println("list of any")

    var c = listOf<Any>(8,9.3,"hi",'v') //it is read-only list

    for (i in c)
    println(i)

    // may are available see internet

}