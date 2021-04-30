class A
{
    companion object
    {
        @JvmStatic
        fun show()
        {
            println("It is like static ")   //without @JvmStatic we can call from kotlin if we want to call also from java use @JvmStatic
        }
    }
}

fun main() 
{
    
    A.show()
}