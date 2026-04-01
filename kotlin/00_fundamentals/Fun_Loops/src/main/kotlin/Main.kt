fun main() {

    for (i in 1..10) { print("$i, ") }; print("End.")
    println() // .. is a range that includes the last number from low to high

    for (i in 1 until 10) { print("$i, ") }; print("End.")
    println() // until is a range that excludes the last number, low to high

    for (i in 10 downTo 1) { print("$i, ") }; print("End.")
    println() // downTo is a range that counts from a high to low

    for (i in 10 downTo 1 step 2) { print("$i, ") }; print("End.")
    println() // step skips a specific value for each iteration until lowest number

    for (i in 1..10 step 2) { print("$i, ") }; print("End.")
    println() // step also works with '..' and 'until'
}