import kotlin.time.Duration.Companion.minutes

fun main()
{
    var variable : Int
    variable = 123
    var variable2 = 1234
    println(variable)
    println(variable2 + variable) // Zmienne zawsze nazywa sie camelCasem

    var variable3: Int = 200
    var byte: Byte = 1
    var short: Short = 20
    var long: Long = 1000000000000000000

    var double: Double = 1.0
    var float: Float = 2f

    var boolean: Boolean = true
    var char: Char = 'a'
    var string: String = "Hello World"

    var int : Int = 0
    var long2 : Long = int.toLong()

    // var zmienna val stała

    var variableNull : Int? = null
    variableNull?.minus(1)
}