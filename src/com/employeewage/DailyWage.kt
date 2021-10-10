package com.employeewage

object DailyWage{
    fun dailyWage(employeeType: Int, wagePerHour : Int, workingHoursPerDay : Int): Pair<Int,Int>{
        var dailyWage = when(employeeType){
            EmployeeWageConstants.FULL_TIME -> {Pair(workingHoursPerDay * wagePerHour,workingHoursPerDay)}
            EmployeeWageConstants.PART_TIME -> {Pair((workingHoursPerDay/2) * wagePerHour,workingHoursPerDay/2)}
            else -> {Pair(0,0)}
        }
        return  dailyWage

    }
}
