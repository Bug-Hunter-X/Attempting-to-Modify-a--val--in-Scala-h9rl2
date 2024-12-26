```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y 
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val obj = new MyClass(5)
    println(obj.myMethod(10)) // Output: 15
    println(obj.x) // Output: 5
    //Attempting to modify a val
    obj.x = 6
  }
}
```