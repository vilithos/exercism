fun main() {

    val x: Int = 5;
    val y: Double = 3.0;

    println("Operators using x=5 and y=3");
    println("$x + $y = ${x + y}");
    println("$x - $y = ${x - y}");
    println("$x * $y = ${x * y}");
    println("$x / $y = ${x * y}");
    println("$x % $y = ${x % y}");

    println("Specific Numbers used:");
    println("3 + 3 * 4 = ${(3 + 3) * 4}");

    // operator written out fully
    var result: Double = 0.0;
    result = result + x;
    println("The result is $result");
    // operator written shortform
    result = 0.0;
    result += x;
    println("The result is $result");

    // operators are the same as in C# such as +=, -=, ++, --, >=, <=, ==, !, &&, %%, *=, /=, %=, 
    result = 0.0 + ((x * x) * 2);
    if (result >= 42) { println("The result ($result) is larger than 42.") }

}
