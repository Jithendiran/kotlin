// java can call function in kotlin
// kotlin can call function in java
// any thing can possible class 

//from java call 8_functionKt.add(1,2) like that because it is not in class it is static like behaviour or below step

//@file:JvmName("anyname") this line must in kotlin file and in java call like this anyname.add(1,2)


fun add(i:Int, j:Int):Int
{
    return i+j
}

fun sub(i:Int, j:Int):Int=i-j

fun max(i:Int, j:Int):Int= if(i<j) j else i

//default argument
fun def(a:Int, b:Int=20):Int=a*b

fun nameed(a:Int, b:Int)
{
    println("a:$a\nb:$b")
}
fun main() 
{
    println(add(1,2))
    println(sub(6,3))
    println(max(9,8))
    println(def(1))
    println(def(2,3))
    // named parameter
    println(nameed(b=78,a=45))

}
