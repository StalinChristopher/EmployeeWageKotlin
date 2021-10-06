package com.employeewage

import com.employeewage.CheckAttendance.attendance

fun dailyWage(): Int{
    var empAttendance = attendance()
    if(empAttendance == IS_PRESENT){
        return DAILY_WORKING_HOURS * WAGE_PER_HOUR
    }else{
        return 0

    }
}