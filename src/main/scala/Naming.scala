object Naming extends App {

  def first = 5

  val second = 5 + 5

  var variable = "Test"

  val typedName: Int = 10

  def testFunction(x: Int, y: Int): Int = x + y

  def secondFunction(x: Int): Int = {
    val y = x + 2
    y
  }

  println(testFunction(first, second))
  println(secondFunction(typedName))
  println(variable)

//  def main(args: Array[String]): Unit = {
//    println(testFunction(first, second))
//    println(secondFunction(typedName))
//  }

}
