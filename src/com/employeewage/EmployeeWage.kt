package com.employeewage

data class EmployeeWage(var company : String, var wagePerHour : Int, var workingHoursPerDay : Int, var noOfWorkingDays : Int, var noOfWorkingHoursPerMonth : Int) {
    var totalWage = 0
    fun computeWage(){
            var totalDays = 0
            var totalHours = 0
            while(totalDays < noOfWorkingDays  && totalHours < noOfWorkingHoursPerMonth) {
                totalDays++
                println("\nDay $totalDays")
                var empType = CheckAttendance.attendance()
                var result = DailyWage.dailyWage(empType, wagePerHour, workingHoursPerDay)
                var dailywage = result.first
                var workingHours = result.second
                totalHours += workingHours
                totalWage += dailywage
                println("Hours worked today : $workingHours \tWages earned today : $dailywage ")
            }
            println("\nTotal days worked : $totalDays")
            println("Total hours worked : $totalHours")
    }

    override fun toString(): String {
        return "Total wage of the company $company is $totalWage"
    }
}