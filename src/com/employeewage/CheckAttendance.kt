package com.employeewage

object CheckAttendance {
    fun attendance() :Int {
        var randomNum = (0..2).random()
        if(randomNum == FULL_TIME){
            println("Employee is present and is working full time")
            return FULL_TIME
        }else if(randomNum == PART_TIME){
            println("Employee is present and is working part time")
            return PART_TIME
        }else{
            println("Employee is absent")
            return IS_ABSENT
        }
    }

}