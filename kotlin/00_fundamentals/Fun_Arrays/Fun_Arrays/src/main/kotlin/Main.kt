fun main(args: Array<String>) {
//    val names: Array<String> = arrayOf("Frog", "Bear", "Axolotl");
//    val numbers: Array<Any> = arrayOf(1,2,3,4,5,"Name 1","Name 2", 'a', 'b');
//
////    names[0] = "Slime";
////    println("First element: ${names[0]}");
////    println("First element: ${names.size}");
//
//    for (n in names) { println(n) }
//    println("---------")
//    for (i in numbers) { if (i is String) println(i) }

    val max: Int = findMinAndMax(arrayOf(10,20,30,40,60,80,90), true)
    val min: Int = findMinAndMax(arrayOf(10,20,30,40,60,80,90), false)
    println("Max value is: $max \t| Min value is: $min")
}

fun findMinAndMax(numbers: Array<Int>, searchMax: Boolean): Int {
    var max: Int = numbers[0];
    var min: Int = max;
    if (searchMax == true) {
        for (num in numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    else {
        for (num in numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}