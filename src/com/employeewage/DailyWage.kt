package com.employeewage

import com.employeewage.CheckAttendance.attendance

fun dailyWage(employeeType: Int): Int{
    var dailyWage = when(employeeType){
        Employee.FULL_TIME -> {Employee.FULL_TIME_WORKING_HOURS * Employee.WAGE_PER_HOUR}
        Employee.PART_TIME -> {Employee.PART_TIME_WORKING_HOURS * Employee.WAGE_PER_HOUR}
        else -> {0}
    }
    return  dailyWage

}