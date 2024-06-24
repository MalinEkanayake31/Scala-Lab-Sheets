object q3{
    def main(args: Array[String]): Unit={
        var typical_normalWorkingHours = 40
        var typical_OTWorkingHours = 30
        println("Take home salary")
        println(s"Normal working hours : $typical_normalWorkingHours")
        println(s"OT working hours     : $typical_OTWorkingHours")
        println(s"                     : ${find_salary(typical_normalWorkingHours , typical_OTWorkingHours)}")
    }

    def normalWorkingHours(hours: Int): Double={
        hours * 250
    }

    def OTWorkingHours(hours: Int): Double={
        hours * 85
    }

    def tax(basic_salary: Double): Double={
        basic_salary * 0.12
    }

    def basic_salary(normal_hours: Int , OT_hours: Int): Double={
        normalWorkingHours(normal_hours) + OTWorkingHours(OT_hours)
    }

    def find_salary(normal_hours: Int , OT_hours: Int): Double={
        basic_salary(normal_hours , OT_hours) - tax(basic_salary(normal_hours , OT_hours))
    }
}