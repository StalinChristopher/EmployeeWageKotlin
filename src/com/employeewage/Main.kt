package com.main

import com.employeewage.CheckAttendance
import com.employeewage.CheckAttendance.attendance
import com.employeewage.dailyWage
import com.employeewage.monthWages

fun main(){
    println("Welcome to employee wage problem")
    var empAttendance = attendance()
    var dailyWage = dailyWage(empAttendance)
    println("Today's wage of the employee is $dailyWage")
    var monthlyWage = monthWages(dailyWage)
    println("Monthly wage of the employee is $monthlyWage")
}