//kotlinc 1_hello.kt -include-runtime -d 1_hello.jar

//java -jar 1_hello.jar

fun main(args:Array<String>) 
{
    println("Hello ");
    var a:Int = 0;
    a=3; //ok

    val b:Int = 4;
    //b=3; error

    println("Addition : ${a+b}")

    var c = a+b; // type is optional
    println("Addition : $c")
} 