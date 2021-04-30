fun main()
{
    /**
     * filter it filter some value
     * map it is applied to all values in list or array ,..etc
     */
    var a = listOf(1,2,3,4,5,6,7)

    var even = a.filter { it%2 == 0}
    println("after filter")
    even.forEach( {i -> println(i)})

    var double = even.map { it * 2}
    println("after double")
    double.forEach( {i -> println(i)})
    print("after reduce")
    var reduce = double.reduce{acc,i -> i+acc} //4+8+12 = 24
    println(reduce)
}