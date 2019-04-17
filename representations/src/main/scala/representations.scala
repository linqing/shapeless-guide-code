final case class Employee(
  name    : String,
  number  : Int,
  manager : Boolean
)

final case class IceCream(
  name        : String,
  numCherries : Int,
  inCone      : Boolean
)



object Main extends Demo {
  val employee = Employee("Bill", 1, true)
  val iceCream = IceCream("Cornetto", 0, true)

  println(employee)
  println(iceCream)
}
