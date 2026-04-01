fun main() {
    var froggy: String = "Frog";
    var beary: String = "Beary";
    var speedA: Int = 40;
    var speedB: Int = 69;
    var speedC: Int = 120;
    var speedD = 420

    sayHello();
    sayHello(froggy);
    sayHello(name = "Doggy");
    reachSpeed(froggy, speedA);
    jumpHigh(froggy);

    println(""); // space

    if (getMaxSpeed(speedA, speedB) > 100) { println("$froggy wins the race with style!") };
    else { println("$froggy loses the race in a crash...") };

    if (getMaxSpeed(speedA, speedB, speedC) > 100) { println("$beary wins the race with style!") };
    else { println("$beary loses the race in a crash...") };

    println("The total crowd today is made of ${totalCrowd(2,3,5,7,1,1,1,2,3,8,1,5,1,3,5)} people.")
    println("The Grand Cup holds ${totalBets(213,23,5,100,420,500,123,25,61,7,3,10)} bucks!")
};

fun sayHello( name: String = "Nobody" ) {
    println("Hello $name");
};

fun jumpHigh( name: String ) {
    println("$name jumps high into the air.");
};

fun reachSpeed(name: String, speed: Int) {
    println("$name accelerates to $speed km/h.");
};

// signature, args, return type, code block
fun getMaxSpeed(a: Int, b: Int): Int {
    var max: Int = if (a > b) a else b;
    return max;
};
fun getMaxSpeed(a: Int, b: Int, c: Int): Int {
    var max: Int = if (a > b && a > c) a else if (b > a && b > c) b else c;
    return max;
};

fun totalBets(vararg numbers: Int) : Int {
    var total: Int = 0;
    for (bet in numbers) {
        total += bet;
    }
    return total;
}

fun totalCrowd(vararg numbers: Int): Int {
    var total: Int = 0;
    numbers.forEach { total += it }
    return total;
}