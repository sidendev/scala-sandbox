// Define base trait to represent tree nodes
trait T {}

// case class representing a non-empty tree node with a value (`item`) and two children (`left`, `right`)
case class Tree(val item: String, val left: T, val right: T) extends T {}

// case class representing an empty tree
case class Empty() extends T {}

object PatternMatchingReview extends App {

  // Recursively concatenates all strings in a list into one string
  def concatenateString(list: List[String]): String = {
    list match {
      case Nil => ""  // base case: if list is empty, return an empty string
      case head :: tail => head + concatenateString(tail)
      // match the head and tail of the list
      // concatenate head with the result of recursively processing the tail
    }
  }

  // Returns a new list containing only elements with length greater than 2
  def filterElements(list: List[String]): List[String] = {
    list match {
      case Nil => Nil  // base case: empty list returns empty list
      case head :: tail =>
        if (head.length > 2) List(head) ++ filterElements(tail)
        else filterElements(tail)
      // include head only if it has more than 2 characters, then continue recursively
    }
  }

  // Traverses a tree and returns a list of all item values as strings
  def stringList(tree: T): List[String] = {
    tree match {
      case Empty() => Nil  // if the tree node is empty, return empty list
      case Tree(x, t1, t2) => (List(x) ++ stringList(t1)) ++ stringList(t2)
      // extract the item from the current node and recursively process left and right
    }
  }

  // Counts the number of leaves in the tree - leaf has no children
  def numberOfLeaves(tree: T): Int = {
    tree match {
      case Empty() => 0  // empty node does not count as a leaf
      case Tree(_, Empty(), Empty()) => 1  // node with no children is a leaf
      case Tree(_, t1, t2) => numberOfLeaves(t1) + numberOfLeaves(t2)
      // recursively sum the leaf counts of left and right subtrees
    }
  }

  // Tests
  val testList = List("Test", "Andrew", "Stefano", "Logan", "A")

  // Print results
  println("Result of concatenateString: " + concatenateString(testList))
  println("Result of filterElements: " + filterElements(testList))

  // Create a sample tree:
  //         Test1
  //        /     \
  //    Test2     Test3
  //    /
  // Test4
  val testTree = Tree(
    "Test1",
    Tree(
      "Test2",
      Tree("Test4", Empty(), Empty()),
      Empty()
    ),
    Tree("Test3", Empty(), Empty())
  )

  println("Result of stringList: " + stringList(testTree))
  println("Result of numberOfLeaves: " + numberOfLeaves(testTree))

} // end app
