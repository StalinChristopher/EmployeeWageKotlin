package com.employeewage

object DailyWage{
    fun dailyWage(employeeType: Int): Pair<Int,Int>{
        var dailyWage = when(employeeType){
            EmployeeWage.FULL_TIME -> {Pair(EmployeeWage.FULL_TIME_WORKING_HOURS * EmployeeWage.WAGE_PER_HOUR,EmployeeWage.FULL_TIME_WORKING_HOURS)}
            EmployeeWage.PART_TIME -> {Pair(EmployeeWage.PART_TIME_WORKING_HOURS * EmployeeWage. WAGE_PER_HOUR,EmployeeWage.PART_TIME_WORKING_HOURS)}
            else -> {Pair(0,0)}
        }
        return  dailyWage

    }
}
