// Higher order Functions and Anonymous Functions...

object HigherOrderFunctions extends App {
  // `map` is a higher-order function that takes a function as its argument.
  // The anonymous function `x => x * x` squares each element in the list.
  val result = List(1, 2, 3, 4).map(x => x * x)

  // `filter` is a higher-order function that takes a predicate function.
  // The anonymous function `x => x % 2 == 0` filters for even numbers.
  val filtered = List(1, 2, 3, 4, 5, 6).filter(x => x % 2 == 0)

  // `reduce` is a higher-order function that combines elements of the list.
  // The anonymous function `(x, y) => x * y` multiplies the elements.
  val reduced = List(1, 2, 3, 4, 5, 6).reduce((x, y) => x * y)

  // This line chains multiple higher-order functions: filter, map, then reduce.
  // Step 1: filter keeps even numbers: List(2, 4, 6, 8, 10)
  // Step 2: map doubles each element: List(4, 8, 12, 16, 20)
  // Step 3: reduce sums them together: 60
  val composed = List(1, 2, 4, 6, 7, 8, 10).filter(x => x % 2 == 0).map(y => y * 2).reduce((i, j) => i + j)
  
  println("result is: " + result)
  println("filtered is: " + filtered)
  println("reduced is: " + reduced)
  println("composed is: " + composed)
}
