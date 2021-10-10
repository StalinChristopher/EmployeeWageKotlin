package com.employeewage

import com.employeewage.CheckAttendance.attendance

object ConditionalWage{
    fun conditionalWage(){
        var totalDays = 0
        var totalHours = 0
        var totalWage = 0
        while(totalDays < EmployeeWage.WORKING_DAYS_MONTH  && totalHours < EmployeeWage.WORKING_HOURS_MONTH){
            totalDays++
            println("\nDay $totalDays")
            var empType = attendance()
            var result = DailyWage.dailyWage(empType,EmployeeWage.WAGE_PER_HOUR)
            var dailywage = result.first
            var workingHours = result.second
            totalHours +=workingHours
            totalWage += dailywage
            println("Hours worked today : $workingHours \tWages earned today : $dailywage ")
        }
        println("\nTotal wages earned by the employee is : $totalWage")
        println("Total days worked : $totalDays")
        println("Total hours worked : $totalHours")
    }
}
