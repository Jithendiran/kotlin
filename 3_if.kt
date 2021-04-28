fun main()
{
    var a:Int = 7;

    var b:Int = 6

    var res : Int= if (a>b)
            a
            else 
            b
    
     // the above pgm 
     /*
     var res:Int=0
     if(a>b)
     {
         res = a
     }
     else
     {
         res = b
     }
     
     */

     println(res)

     var a1:String = "same";
     var b1:String = "same";
     if (a1.equals(b1))  // or a1==b1   when we use equals pass 2nd argument as true to case insensitive  a1.equals(b1,true)
     println("Same");
     else
     println("Not same")

}