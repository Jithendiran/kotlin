interface An
{
    fun hy()
}
fun main() 
{
    var obj:An = object : An
                        {
                            override fun hy()
                            {
                                println("It is like java annonyms function in interface")
                            }
                        }
    obj.hy()
}