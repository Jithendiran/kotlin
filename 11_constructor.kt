class a constructor(na:String = "no  value") //primary constructor
{
    var a1:String=na
    fun skow()
    {
        println(a1)
    }
}

class b(na:String = "no value") // primary constructor
{
    var a1:String=na
    fun skow()
    {
        println(a1)
    }
}

class c(na:String = "no value") // primary constructor with init
{
    var a1:String=""
    init
    {
        a1 = na
    }
    fun skow()
    {
        println(a1)
    }
}

class d(na:String = "no value") // secondary constructor
{
    var a1:String=na

    constructor(na:String,i:Int) : this(na)  // value to primary constructor it is mandatory
    {
            println("From secondary constructor")
            println(a1+"   "+i)
    }
    fun skow()
    {
        println(a1)
    }
}


fun main() 
{
    var n = a(" a constructor")
    
    n.skow()

    var n1 = b(" b constructor")
    n1.skow()

    var n_1 = a()
    
    n_1.skow()

    var n1_1 = b()
    n1_1.skow()

    var c1  = c(" from constructor and init")
    c1.skow()

    var d1 = d("from d") //with 1 argument it don't call secndary constructor
    d1.skow()

    var d2 = d("from d",2) //with 2 argument it call secndary constructor and primary
    d2.skow()
}