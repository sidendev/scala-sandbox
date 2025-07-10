object Generics extends App {

  // Creating generics:

  // A generic trait `Tree` that holds elements of any type `T`
  // `T` is a type parameter that lets this trait work with any type
  trait Tree[T] {
    def getItem(): T
  }

  // A concrete implementation of Tree that holds an item and two child trees
  // `Node[T]` stores an item of type T, and two subtrees (left and right) of the same type
  class Node[T](val item: T, val left: Tree[T], val right: Tree[T]) extends Tree[T] {
    // Implements the `getItem` method from the Tree trait
    def getItem(): T = this.item
  }

  // Another implementation of Tree that represents an empty node
  // Since it doesn't hold any item, calling getItem throws an error
  class Empty[T] extends Tree[T] {
    def getItem(): T = throw new Error("An empty tree doesn't have an item")
  }

  def createList[T] (a: T, b: T): List[T] = List(a, b)

  // testing tree:
  // Creating a tree where the item is of type Int (example: Tree[Int])
  // The left and right children are empty trees of type Int
  val tree = new Node[Int](5, new Empty[Int], new Empty[Int])

  // Prints: "The item is 5"
  println("The item is " + tree.getItem())
  // println("The item in the left child of the root node is " + tree.left.getItem()) test to get the error output

  // testing createList:
  println("The list of Int is: " + createList[Int](1, 2))
  println("Sum of Float is: " + createList[String]("Hello", "World"))

}
