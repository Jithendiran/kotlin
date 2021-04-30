fun main() 
{
    var a = listOf(1, 2,"ji") 
    for (i in a)
    println(i)

    println("using foreach")

    

    a.forEach ({println(it)})
    a.forEach ({t -> println(t)}) // if we don't want to use variable name use 'it' like above
    /**
     * for each accept consumer obj ,consumer is an interface that only have accept(i:int) function so we use annonyms function
     * foreach give one by one value to consumer's accept method that print value
     * {print(it)} is shortone of that
     * 
     * 
     * var c:Consumer<Int> = object:Consumer<Int>
        {
        override fun accept(i: Int)
        {
            println(i)
        }
        } 
    
        a.forEach (c) // it will work

        
     */

     println("another one")

     a.forEach(::println) //net search
}