fun main()
{
    println("Hello World")

    var liczba: Int = 100
    liczba = -5
    println(liczba)

    var a : Float? = 12.54F
    var b : Float? = 33.77F
    var c : Float? = a
    a = b
    b = c


    println(a?.toInt())
    println(b?.toInt())

    

}