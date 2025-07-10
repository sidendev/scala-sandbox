object AbstractsAndTraits extends App {

  abstract class Abstract(x: Int, y: Int) {
    val firstField: Int = x
    val secondField: Int = y

    def absMethod(): Unit
    def printMethod() = println(this.firstField)
  }

  trait Trait {
    def traitFirstMethod() = println("First method of the Trait")

    def traitSecondMethod(): Unit
  }

  class MaterializedClass(val x: Int, val y: Int, val z: Int) extends Abstract(x, y) with Trait {
    def absMethod(): Unit = println(this.y)

    def traitSecondMethod(): Unit = println("Second method of the Trait implemented by the class")

    override def printMethod() = println(this.z) // overrides the original method
  }

  // Calling to test:
  val firstInstance: MaterializedClass = new MaterializedClass(1, 2, 3)
  firstInstance.printMethod()
  firstInstance.traitFirstMethod()

}
