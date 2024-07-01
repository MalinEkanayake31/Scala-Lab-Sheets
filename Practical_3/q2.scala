import scala.io.StdIn

object FilterLongStringsObject {
  def main(args: Array[String]): Unit = {
    println("Please enter strings separated by commas:")

    val inputString: String = StdIn.readLine()
    val inputList: List[String] = inputString.split(",").map(_.trim).toList

    val filteredList: List[String] = filterLongStrings(inputList)

    println(s"Filtered list: $filteredList")
  }

  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }
}
