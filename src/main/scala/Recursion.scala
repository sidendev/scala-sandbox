import scala.annotation.tailrec

object Recursion extends App {

  def sumBetween(a: Int, b: Int): Int = {
    if (a <= b) a + sumBetween(a + 1, b) else 0
  }

  @tailrec
  def sumBetween(a: Int, b: Int, sum: Int): Int = {
    if (a <= b) sumBetween(a + 1, b, sum + a) else sum
  }

  // factorial recursive function:
  def factorial(n: Int): Int = {
    if (n > 0) n * factorial(n - 1) else 1
  }

  // tail recursive version:
  @tailrec
  def factorialTailRec(n: Int, returnValue: Int): Int = {
    if (n > 0) factorialTailRec(n - 1, returnValue * n) else returnValue
  }

  def countDown(n: Int): Unit = {
    var i = n
    while (i >= 0) {
      println(i)
      i -= 1
    }
  }

  // with tail recursion
  @tailrec
  def countDownTailRec(n: Int): Unit = {
    if (n < 0) ()
    else {
      println(n)
      countDownTailRec(n - 1)
    }
  }

  println(factorial(3))
  println(factorialTailRec(3, 1))
  // println(countDown(10))
  println(countDownTailRec(10))

}
