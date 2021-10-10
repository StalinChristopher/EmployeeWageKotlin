package com.employeewage

object CheckAttendance {
    fun attendance() :Int {
        var randomNum = (0..2).random()
        return when(randomNum){
            EmployeeWageConstants.FULL_TIME -> {
                println("Employee is present and is working full time")
                EmployeeWageConstants.FULL_TIME
            }
            EmployeeWageConstants.PART_TIME -> {
                println("Employee is present and is working part time")
                EmployeeWageConstants.PART_TIME
            }
            else -> {
                println("Employee is absent")
                EmployeeWageConstants.IS_ABSENT
            }
        }
    }

}