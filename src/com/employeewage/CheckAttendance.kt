package com.employeewage

object CheckAttendance {
    fun attendance() :Int {
        var randomNum = (0..2).random()
        return when(randomNum){
            FULL_TIME -> {
                println("Employee is present and is working full time")
                FULL_TIME
            }
            PART_TIME -> {
                println("Employee is present and is working part time")
                PART_TIME
            }
            else -> {
                println("Employee is absent")
                IS_ABSENT
            }
        }
    }

}