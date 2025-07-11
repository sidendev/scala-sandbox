object ListRangeMap extends App {

  // List.........
  val listOne = List(1, 2) // It represents a List that contains two Int: 1, 2
  val listTwo = List[String]() // It represents an empty List of Strings

  List() // empty list
  Nil // empty list also

  def createIntList(): List[Int] = List(1, 2, 3, 4, 5)
  def sumItems(list: List[Int]): Int = {
    if (list.isEmpty) 0 else list.sum
  }
  def printItems(list: List[Int]) = list.foreach(println)

  val newList: List[Int] = createIntList()
  printItems(newList)
  println("The sum of the list's items is: " + sumItems(newList))


  // Range.........
  val rangeOne = Range(1, 10, 1) // It creates a Range from 1 to 10 with a step of 1
  val rangeTwo = Range(10, 1, -1) // It creates a Range from 10 to 1 with a step of -1
  val compactRange = 1 to 10 by 1 // It creates a Range from 1 to 10 with a step of 1 (this is the most compact version)

  def createRangeInclusive(): Range = 1 to 10 by 1
  def createRangeExclusive(): Range = 1 until 10 by 1
  def printOut(range: Range) = range.foreach(println)
  def firstLast(range: Range): (Int, Int) = (range.head, range.last)

  val inclusive: Range = createRangeInclusive()
  val exclusive: Range = createRangeExclusive()
  printOut(inclusive)
  val tuple: (Int, Int) = firstLast(exclusive)
  println("First is: " + tuple._1 + ", and last is: " + tuple._2)


  // Map...........
  val mapOne = Map("x" -> 1, "y" -> 2) // It creates a Map with two keys (x and y) and each one has an Int value associated
  val mapTwo = Map[String, String]("name" -> "Stefano", "surname" -> "Cascavilla")

  def createMap(): Map[String, Int] = Map(
    "first" -> 1,
    "second" -> 2,
    "third" -> 3
  )
  def getItem(map: Map[String, Int], key: String): Int = {
    if (map.contains(key)) map(key) else throw new Error("The specified key doesn't exist")
  }
  def updateItem(map: Map[String, Int], key: String, newValue: Int): Map[String, Int] = {
    if (map.contains(key)) map.updated(key, newValue) else throw new Error("The specified key doesn't exist")
  }

  val createdMap: Map[String, Int] = createMap()
  println("The returned item is: " + getItem(createdMap, "first"))
  val updatedMap: Map[String, Int] = updateItem(createdMap, "second", 5)
  println("The updated item is: " + getItem(createdMap, "second"))

}
