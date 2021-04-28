fun add(i:Int, j:Int):Int
{
    return i+j
}

fun sub(i:Int, j:Int):Int=i-j

fun max(i:Int, j:Int):Int= if(i<j) j else i


fun main() 
{
    println(add(1,2))
    println(sub(6,3))
    println(max(9,8))
}