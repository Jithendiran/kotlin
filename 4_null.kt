//kotlinc 4_null.kt -include-runtime -d 4_null.jar

//java -jar 4_null.jar

// handling null 

 fun main()
{

   // var str : String = null      //error because null is not allowed 
   var str:String?=null   // to fource to use null use ?

   println(str)

   //println(str.length)  error

   println(str?.length)
} 