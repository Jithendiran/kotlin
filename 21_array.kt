fun  main()
{
    var a = intArrayOf(10,20,30,40) //use this if values are known

    for (i in a)
        println(i)

    //update values
    a[1] = 11
    a.set(2,33)

    println(a.get(1))
    println(a[2])
    println("size : "+a.size)

    for (i in a)
        println(i)

    println("last : "+a.last())


    var b = IntArray(5) // 5 is size
    for (i in 0..4)
        b[i] = Integer.valueOf(readLine())  
    
    for (i in b)
    println(i)

    

    

    
}