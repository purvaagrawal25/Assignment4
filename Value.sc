case class FirstName(fname: String) extends AnyVal{
  def xyz1()="Purva"
}
case class LastName(lname: String) extends AnyVal{
  def xyz2()="Agrawal"
}

case class Age(age: Int) extends AnyVal
def xyz3()=23
class Test {
  def displayDetails(): Unit = {
    val obj1 = new FirstName()
    val obj2 = new LastName()

  }
}