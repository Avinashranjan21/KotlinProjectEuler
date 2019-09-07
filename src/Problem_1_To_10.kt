fun main() {
    println("Hello Project Euler")
//    Problem 1 call
    multiplesOf3And5()

}


/**
 * Problem 1: If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000. Answer : 233168
 * */

fun multiplesOf3And5() {
    val maxNumber = 1000
    var result = 0
    for (i in 0 until maxNumber) {
        if (i % 3 == 0 || i % 5 == 0) result += i
    }
    println("Sum of all the multiples of 3 or 5 below $maxNumber is $result")
}