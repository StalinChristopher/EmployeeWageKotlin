package com.employeewage

import com.employeewage.CheckAttendance.attendance

fun dailyWage(employeeType: Int): Pair<Int,Int>{
    var dailyWage = when(employeeType){
        Employee.FULL_TIME -> {Pair(Employee.FULL_TIME_WORKING_HOURS * Employee.WAGE_PER_HOUR,Employee.FULL_TIME_WORKING_HOURS)}
        Employee.PART_TIME -> {Pair(Employee.PART_TIME_WORKING_HOURS * Employee. WAGE_PER_HOUR,Employee.PART_TIME_WORKING_HOURS)}
        else -> {Pair(0,0)}
    }
    return  dailyWage

}