// For Expression in Scala - Loops

object ForExpressions extends App {

  // This method takes a list of strings and returns a new list where:
  // Only the strings starting with "A" are included (filtered)
  // Those strings are capitalized
  // The `for` expression is used here as a filter and transformer.
  def capitalizeAll(list: List[String]): List[String] = {
    for {
      x <- list                      // iterate through each string in the list
      if (x.startsWith("A"))        // filter: only keep strings that start with "A"
    } yield x.capitalize             // transform: capitalize the string
  }

  // This method generates all pairs of integers (x, y) where:
  // x ranges from 0 to i
  // y ranges from 0 to j
  // The result is a list of all combinations of these two ranges.
  def numberPairs(i: Int, j: Int): List[(Int, Int)] = {
    val result = for {
      x <- 0 to i by 1              // outer loop from 0 to i
      y <- 0 to j by 1              // inner loop from 0 to j
    } yield (x, y)                  // yield a tuple (x, y)
    result.toList                  // convert the result from a Vector to a List
  }

  // This method applies a filter and then a map transformation to a list of ints:
  // First, only keep the elements that satisfy the `filter` function
  // Then, apply the `map` function to each of those elements
  def mapFilter(map: Int => Int, filter: Int => Boolean, list: List[Int]): List[Int] = {
    for {
      x <- list                    // iterate through the list
      if (filter(x))              // apply filter condition
    } yield map(x)                // apply mapping function
  }

  // Output the results of the three methods
  println("capitalizeAll result is: " + capitalizeAll(List("Andy", "Andrew", "Stefano")))
  println("numberPairs result is: " + numberPairs(5, 6))
  println("mapFilter result is: " + mapFilter(
    x => x * 5,                   // map: multiply each number by 5
    x => x > 4,                   // filter: only keep numbers greater than 4
    List(3, 4, 5, 6)
  ))

}

