import scala.io.StdIn

object StudentRecords extends App {

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (marks < 0 || totalMarks < 0) {
      (false, Some("Marks and total possible marks must be positive integers."))
    } else if (marks > totalMarks) {
      (false, Some("Marks cannot exceed total possible marks."))
    } else {
      (true, None)
    }
  }

  def getStudentInfo: (String, Int, Int, Double, Char) = {
    println("Enter student name:")
    val name = StdIn.readLine()
    println("Enter student marks:")
    val marks = StdIn.readInt()
    println("Enter total possible marks:")
    val totalMarks = StdIn.readInt()

    val (isValid, errorMessage) = validateInput(name, marks, totalMarks)

    if (!isValid) {
      println(s"Error: ${errorMessage.getOrElse("Invalid input")}")
      getStudentInfo
    } else {
      val percentage = (marks.toDouble / totalMarks) * 100
      val grade = percentage match {
        case p if p >= 90 => 'A'
        case p if p >= 75 => 'B'
        case p if p >= 50 => 'C'
        case _ => 'D'
      }
      (name, marks, totalMarks, percentage, grade)
    }
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(s"Percentage: $percentage%")
    println(s"Grade: $grade")
  }

  def getStudentInfoWithRetry: (String, Int, Int, Double, Char) = {
    var validInput = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'F')

    while (!validInput) {
      val (name, marks, totalMarks, percentage, grade) = getStudentInfo
      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
      if (isValid) {
        validInput = true
        studentInfo = (name, marks, totalMarks, percentage, grade)
      } else {
        println(s"Error: ${errorMessage.getOrElse("Invalid input")}")
      }
    }

    studentInfo
  }

  val studentRecord = getStudentInfoWithRetry
  printStudentRecord(studentRecord)
}
