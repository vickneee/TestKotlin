fun main() {

    /* The code below will print the words Hello World
    to the screen, and it is amazing */
    println("Hello World!")
    println("I am learning Kotlin.")
    println("It is awesome!")

    // Commenting out the next line
    // println("This line is commented out.")

    /* The difference between var and val is
    that variables declared with the var keyword can be changed/modified, while val variables cannot. */
    var name0 = "John" // String (text)
    val birthYear = 1975 // Integer (whole number)

    println(name0)          // Print the value of name
    println(birthYear)     // Print the value of birthyear

    // When you create a variable with the val keyword, the value cannot be changed/reassigned.
    val name: String = "Elvis" // String
    val birthyear: Int = 1975 // Int

    // name = "John" // This will cause an error

    val name1 = "John"
    println("Hello " + name1)

    val firstName = "John "
    val lastName = "Doe"
    val fullName = firstName + lastName
    println(fullName)

    println(name)
    println(birthyear)

    var newName: String
    newName = "John"
    println(newName)

    print("$name $birthYear")

    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    val myNum1: Int = 5                // Int
    val myDoubleNum1: Double = 5.99    // Double
    val myLetter1: Char = 'D'          // Char
    val myBoolean1: Boolean = true     // Boolean
    val myText1: String = "Hello"      // String

    val myNum2 = 2147483647  // Int
    val myNum3 = 2147483648  // Long

    println(myNum2)
    println(myNum3)

    println(myNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(myText)

    println(myNum1)
    println(myDoubleNum1)
    println(myLetter1)
    println(myBoolean1)
    println(myText1)

    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false

    val myGrade: Char = 'B'
    println(myGrade)

    for (i in 1..5) {

        println("i = $i")
    }

    val sum = add(3, 5)
    println("Sum: $sum")

    val greeting = greet("World")
    println(greeting)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun greet(name: String): String {
    return "Hello, $name!"
}