import scala.io.StdIn

object ReverseStringObject {
  def main(args: Array[String]): Unit = {
    println("Please enter a string:")

    val inputString: String = StdIn.readLine()

    val reversedString: String = reverseString(inputString)

    println(s"Reversed string: $reversedString")
  }

  def reverseString(s: String): String = {
    if (s.isEmpty) ""
    else reverseString(s.tail) + s.head
  }
}
