//throw finally all work in kotlinf

fun  main(args: Array<String>)
 {
    var str:String = "4"

    var num = str.toInt() // or Integer.parseInt()
    num++
    println(num)

    var str1:String = "a"

    try {
        
    var num1 = str1.toInt() // or Integer.parseInt()
    num1++
    println(num1)
    }
    catch(e:Exception)
    {
        println("Give number")
    }
    println(num)
    
    

    
}