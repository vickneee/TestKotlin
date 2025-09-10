fun main() {
    val name = "Kotlin"

    println("Hello, $name!")

    for (i in 1..5) {

        println("i = $i")
    }

    val sum = add(3, 5)
    println("Sum: $sum")
}

fun add(a: Int, b: Int): Int {
    return a + b
}