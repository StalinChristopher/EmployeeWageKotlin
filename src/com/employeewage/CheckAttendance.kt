package com.employeewage

object CheckAttendance {
    fun attendance() :Int {
        var randomNum = (0..1).random()
        if(randomNum == IS_PRESENT){
            println("Employee is present")
            return IS_PRESENT
        }else{
            println("Employee is absent")
            return IS_ABSENT
        }
    }

}