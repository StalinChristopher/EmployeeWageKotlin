package com.employeewage

object CheckAttendance {
    fun attendance() :Int {
        var randomNum = (0..2).random()
        return when(randomNum){
            Employee.FULL_TIME -> {
                println("Employee is present and is working full time")
                Employee.FULL_TIME
            }
            Employee.PART_TIME -> {
                println("Employee is present and is working part time")
                Employee.PART_TIME
            }
            else -> {
                println("Employee is absent")
                Employee.IS_ABSENT
            }
        }
    }

}