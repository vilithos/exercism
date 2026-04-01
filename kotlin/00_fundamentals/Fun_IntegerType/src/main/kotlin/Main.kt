fun main(args: Array<String>) {
    val name: String = "Frog"
    val age: Int = 300
    println("$name is $age years old.")

    val integerMinValue: Int = Int.MIN_VALUE
    val integerMaxValue: Int = Int.MAX_VALUE
    println("Integer can be between $integerMinValue and $integerMaxValue.")

    val byteMinValue: Byte = Byte.MIN_VALUE
    val byteMaxValue: Byte = Byte.MAX_VALUE
    println("Byte can be between $byteMinValue and $byteMaxValue.")

    val shortMinValue: Short = Short.MIN_VALUE
    val shortMaxValue: Short = Short.MAX_VALUE
    println("Short can be between $shortMinValue and $shortMaxValue.")

    val longMinValue: Long = Long.MIN_VALUE
    val longMaxValue: Long = Long.MAX_VALUE
    println("Long can be between $longMinValue and $longMaxValue.")
    val longNumber: Long = 1234567890123456789L
}