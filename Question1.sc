

trait Ordered[T] extends Comparable[T] {
  def compare(that: T): Int
  def <(that: T): Boolean
  def <=(that: T): Boolean
  def >(that: T): Boolean
  def >=(that: T): Boolean
  def compareTo(that: T): Int
}
 class Person(val name: String, val age: Int) extends Ordered[Person]{
  val personOne = new Person("Test", 24)
  val personTwo = new Person("Test", 25)
  def compare(that: Person)= {
    if(this.name.compareTo(that.name) ==0){
    if(this.age>=that.age) 1
    else 0
    }
    else{
      if(this.name.length>=that.name.length) 1
      else 0
    }
  }

  if(1) println("true")
  else println("false")

  personOne < personOne
}