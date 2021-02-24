//Exercise #1
//Defining values
val x : Double = 42.354562
val y : Int = 3

//printing #
println("The round value of x is " + ((x * 100).round / 100.toDouble))
println("The left zero padding version of y is " + ("%04d".format(y)))

//Exercise #2
//defining function
def fact (n:Int): Int = {
  if (n == 0) {
    return 1
  }
  else return n * fact(n - 1)
}
// Compute factorial 5!
{
  println(fact(5))
}

//Exercise #3
//defining function
def fact (b:Double): Double = {
  //converting b to Int
  val c = b.toInt
  if (c == 0) {
    return 1
  }
  else return c * fact(c - 1)
}
// Compute factorial
{
  println(fact(3.2))
}

//Exercise #4
//define fibonacci function
def fibo(count: Int): List[Int] = {
  val b = List(0, 1).toBuffer
  while(b.size < count) b += b.takeRight(2).sum
  b.toList
  }
//print first 10 values
println("First 10 numbers: " +(fibo(10)))

//Exercise #5
//Cube function
def cube(x: Int) : Int = {x * x * x}
println((cube(5)) + " is the cube")