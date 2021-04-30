data class Book(var name:String, var price:Int )
object Bookself
{
    var book = ArrayList<Book>()

    fun showBook()
    {
        for( i in book)
        {
            println(i)      // Book class is data so it will show data
        }
    }
}
fun main() 
{
    Bookself.book.add(Book("Java",50))
    Bookself.book.add(Book("c",50))
    Bookself.book.add(Book("Python",50))
    Bookself.book.add(Book("sql",40))

    Bookself.showBook()
}