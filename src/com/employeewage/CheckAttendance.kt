package com.employeewage

object CheckAttendance {
    fun attendance() :Int {
        var randomNum = (0..2).random()
        return when(randomNum){
            EmployeeWage.FULL_TIME -> {
                println("Employee is present and is working full time")
                EmployeeWage.FULL_TIME
            }
            EmployeeWage.PART_TIME -> {
                println("Employee is present and is working part time")
                EmployeeWage.PART_TIME
            }
            else -> {
                println("Employee is absent")
                EmployeeWage.IS_ABSENT
            }
        }
    }

}