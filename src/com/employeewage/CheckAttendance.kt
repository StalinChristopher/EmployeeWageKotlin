package com.employeewage

object CheckAttendance {
    fun attendance() {
        var randomNum = (0..1).random()
        if(randomNum == IS_PRESENT){
            println("Employee is present")
        }else{
            println("Employee is absent")
        }
    }

}