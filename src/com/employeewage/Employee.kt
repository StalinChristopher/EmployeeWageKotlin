package com.employeewage
import com.employeewage.EmployeeWage
class Employee {
    companion object{
        fun computeWage(company : String, wagePerHour : Int, noOfWorkingDays : Int, noOfWorkingHoursPerMonth : Int){
            var totalDays = 0
            var totalHours = 0
            var totalWage = 0
            while(totalDays < noOfWorkingDays  && totalHours < noOfWorkingHoursPerMonth){
                totalDays++
                println("\nDay $totalDays")
                var empType = CheckAttendance.attendance()
                var result = DailyWage.dailyWage(empType, wagePerHour)
                var dailywage = result.first
                var workingHours = result.second
                totalHours +=workingHours
                totalWage += dailywage
                println("Hours worked today : $workingHours \tWages earned today : $dailywage ")
            }

            println("\nTotal wages earned by the employee in $company is : $totalWage")
            println("Total days worked : $totalDays")
            println("Total hours worked : $totalHours")
            println("\n----------------------------------------------\n")
        }
    }
}