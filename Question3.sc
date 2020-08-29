trait Queue[Int]extends DoubleQueue{
  var q1 = Queue(1, 2, 3, 4, 5)
  print("Queue Elements: ")
  q1.foreach((element:Int) => print(element+" "))
  def enqueue(): Unit = {
    val c = double(2)
    q1.enqueue(c)
    print("Queue Elements after enqueue: ")
    q1.foreach((element: Int) => print(element + " "))
    val a = square(2)
    q1.enqueue(a)
    print("Queue Elements after enqueue: ")
    q1.foreach((element: Int) => print(element + " "))
  }
  def dequeue(): Unit ={
    var deq = q1.dequeue
    print("\nQueue Elements after dequeue: ")
    q1.foreach((element:Int) => print(element+" "))
    print("\nDequeued element: " + deq)
    println("\nQueue is empty: "+ q1.isEmpty)
  }
}
class DoubleQueue(val list:List[Int]) extends SquareQueue{
def double(a:Int):Int=a*2
}
class SquareQueue{
def square(a:Int):Int=a*a
}

