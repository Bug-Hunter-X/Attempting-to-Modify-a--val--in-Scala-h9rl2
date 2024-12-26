```scala
class MyClass(var x: Int) {
  def myMethod(y: Int): Int = {
    x + y 
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val obj = new MyClass(5)
    println(obj.myMethod(10)) // Output: 15
    println(obj.x) // Output: 5
    obj.x = 6
    println(obj.x) // Output: 6
  }
}
```