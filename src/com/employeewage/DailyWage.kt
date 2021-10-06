package com.employeewage

import com.employeewage.CheckAttendance.attendance

fun dailyWage(employeeType: Int): Int{
    var dailyWage = when(employeeType){
        FULL_TIME -> {FULL_TIME_WORKING_HOURS * WAGE_PER_HOUR}
        PART_TIME -> {PART_TIME_WORKING_HOURS * WAGE_PER_HOUR}
        else -> {0}
    }
    return  dailyWage

}