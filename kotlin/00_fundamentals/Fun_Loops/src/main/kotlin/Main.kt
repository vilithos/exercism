fun main() {

//    for (i in 1..10) { print("$i, ") }; print("End.")
//    println() // .. is a range that includes the last number from low to high
//
//    for (i in 1 until 10) { print("$i, ") }; print("End.")
//    println() // until is a range that excludes the last number, low to high
//
//    for (i in 10 downTo 1) { print("$i, ") }; print("End.")
//    println() // downTo is a range that counts from a high to low
//
//    for (i in 10 downTo 1 step 2) { print("$i, ") }; print("End.")
//    println() // step skips a specific value for each iteration until lowest number
//
//    for (i in 1..10 step 2) { print("$i, ") }; print("End.")
//    println() // step also works with '..' and 'until'

    var number: Int = 0;
    var evenNumbersCounter: Int = 0;
    var lastNumber: Int = 20;

//    while (number < 10) { println(number); number++; // head controlled counter loop
//    while (number < 10) { println(number); } // head controlled infinite loop

//    do { println(number); number++ } while (number < 10) // foot-loop runs codeblock at least once, then checks if to continue
//    do { println(number); number++; if (number == 7) { continue; }; } while (number < 10); // skips 7 when number is 7 due to "continue"

//    while (number < 10) { println(number); number++; if (number == 7){ break;} } // "break" the loop if number is 7, loop does not continue

    while (number <= lastNumber) {
        number++;

        if(isEvenNumber(number)) {
            evenNumbersCounter++;
            continue;
        }

        println(number);
    }
    println("There are $evenNumbersCounter even numbers");
}

fun isEvenNumber(number: Int): Boolean {
    if (number % 2 == 0) {
        return number % 2 == 0;
    }
    else return false;
};