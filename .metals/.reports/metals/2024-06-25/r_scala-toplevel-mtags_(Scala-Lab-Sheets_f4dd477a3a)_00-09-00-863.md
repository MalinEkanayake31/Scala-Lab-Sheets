error id: file:///D:/university%20ucsc%202nd%20year/semester%201%20year%202/SCS2204%20Functional%20Programming/scala/Scala-Lab-Sheets/Practical_2/q3.scala:[505..506) in Input.VirtualFile("file:///D:/university%20ucsc%202nd%20year/semester%201%20year%202/SCS2204%20Functional%20Programming/scala/Scala-Lab-Sheets/Practical_2/q3.scala", "object q3{
    def main(args: Array[String]): Unit={
        var typical_normalWorkingHours = 40
        var typical_ = 30
        println("Take home salary--------------------")
        println(s"Normal working hours : $typical_normalWorkingHours")
        println(s"OT working hours     : $typical_")
        println(s"                     : ${find_salary(typical_normalWorkingHours , typical_)}")
    }

    def normalWorkingHours(hours: Int): Double={
        hours * 250
    }

    def (hours: Int): Double={
        hours * 85
    }

    def tax(basic_salary: Double): Double={
        basic_salary * 0.12
    }

    def basic_salary(normal_hours: Int , OT_hours: Int): Double={
        normalWorkingHours(normal_hours) + (OT_hours)
    }

    def find_salary(normal_hours: Int , OT_hours: Int): Double={
        basic_salary(normal_hours , OT_hours) - tax(basic_salary(normal_hours , OT_hours))
    }
}")
file:///D:/university%20ucsc%202nd%20year/semester%201%20year%202/SCS2204%20Functional%20Programming/scala/Scala-Lab-Sheets/Practical_2/q3.scala
file:///D:/university%20ucsc%202nd%20year/semester%201%20year%202/SCS2204%20Functional%20Programming/scala/Scala-Lab-Sheets/Practical_2/q3.scala:15: error: expected identifier; obtained lparen
    def (hours: Int): Double={
        ^
#### Short summary: 

expected identifier; obtained lparen