object Basics extends App {
  // defining a value
  val meaningOfLife: Int = 42 // const int meaningOfLife = 42;

  // Boolean here is optional
  val aBoolean: Boolean = false // all types are optional - can be inferred

  // Types.... Int, Boolean, Char, Double, Float, String
  val anotherBool = true

  // Strings and string operations
  val aString = "I love Scala"
  val aComposedString = "I" + " " + "Love" + " " + "Scala!" // concatenated
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  // expressions are structures that can be reduced to a value
  val anExpression = 2 + 3

  // if expression
  val ifExpression = if (meaningOfLife > 42) 56 else 999 // alt to ternery -> meaningOfLife > 43 ? 56 : 999

  val chainedIfExpression =
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0 ) -2
    else if (meaningOfLife > 999) 78
    else 0

  // code blocks - keeping values local
  // code blocks use curley braces
  // code blocks must return something
  val aCodeBlock = {
    // definitions
    val aLocalValue = 67
    // value of block is the value of the last expression
    aLocalValue + 3
  }

  def sayHello(name: String): Unit = println(s"Hello, $name")
  sayHello("Bertie")

  // define a function - this outputs a string
  def myFunction(x: Int, y: String): String = {
    y + " " + x
  }

  // recursive function - avoid variables and loops
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

//  factorial(5) = 5 * factorial(4) = 5 * 24 = 120
//  factorial(4) = 4 * factorial(3) = 4 * 6
//  factorial(3) = 3 * factorial(2) = 3 * 2
//  factorial(2) = 2 * factorial(1) = 2 * 1
//  factorial(1) = 1

  // The Unit type - same as void in Java
  // type of side effects

  def myUnitFunc(): Unit = {
    println("Use Unit for type of side effects")
  }

  val theUnit = () // this is the value that gets returned from type Unit, empty parenthesis 
}
