import scala.io.StdIn

object SumEvenNumbersApp {
  def main(args: Array[String]): Unit = {
    println("Please enter a list of integers separated by commas:")

    val inputString: String = StdIn.readLine()
    val inputList: List[Int] = inputString.split(",").map(_.trim.toInt).toList

    val sumEven = sumOfEvenNumbers(inputList)

    println(s"The sum of all even numbers in the list is: $sumEven")
  }

  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }
}
