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

}
