// kotlinc class.kt -include-runtime -d class.jar && java -jar class.jar   "compile"
class myClass { 
    // property (data member) 
 var name: String = "";
    // member function 
    fun set(name1:String)
    {
        name = name1;
    }
    fun printMe():String
     { 
        return name 
    } 
}  
fun main()
 {  
    val obj = myClass(); // create obj object of myClass class 
    obj.set("jidesh");
    print(obj.printMe());
}