package com.main

import com.employeewage.CheckAttendance
import com.employeewage.CheckAttendance.attendance
import com.employeewage.dailyWage

fun main(){
    println("Welcome to employee wage problem")
    var empAttendance = attendance()
    var dailyWage = dailyWage(empAttendance)
    println("Today's wage of the employee is $dailyWage")
}