import scala.annotation.tailrec

object RecursionTest extends App {

  trait Abstract {
    def sum(x: Int, y: Int): Int
    def difference(x: Int, y: Int): Int
    def product(x: Int, y: Int): Int
  }

  class Implementation extends Abstract {
    def sum(x: Int, y: Int): Int = x + y
    def difference(x: Int, y: Int): Int = x - y
    def product(x: Int, y: Int): Int = x * y

    @tailrec
    final def sumEven(a: Int, b: Int, partialSum: Int = 0): Int = {
      if (a > b) partialSum
      else {
        val newSum = if (a % 2 == 0) partialSum + a else partialSum
        sumEven(a + 1, b, newSum)
      }
    }
  }

  // testing...
  val impl = new Implementation
  println(impl.sum(5, 3)) // 8
  println(impl.difference(10, 4)) // 6
  println(impl.product(2, 4)) // 8
  println(impl.sumEven(1, 10)) // 30 => 2 + 4 + 6 + 8 + 10

}
