def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)
    val totalLetterCount = wordLengths.reduce(_ + _)
    totalLetterCount
}

object Main extends App {
  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)
    val totalLetterCount = wordLengths.reduce(_ + _)
    totalLetterCount
  }

  val words = List("apple", "banana", "cherry")
  println(countLetterOccurrences(words)) // Output: 18
}
