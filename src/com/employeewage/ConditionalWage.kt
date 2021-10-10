package com.employeewage

import com.employeewage.CheckAttendance.attendance

fun conditionalWage(){
    var totalDays = 0
    var totalHours = 0
    var totalWage = 0
    while(totalDays < Employee.WORKING_DAYS_MONTH  && totalHours < Employee.WORKING_HOURS_MONTH){
        totalDays++
        println("\nDay $totalDays")
        var empType = attendance()
        var result = dailyWage(empType)
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