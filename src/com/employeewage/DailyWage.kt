package com.employeewage

import com.employeewage.CheckAttendance.attendance

fun dailyWage(): Int{
    var empAttendance = attendance()
    if(empAttendance == FULL_TIME){
        return FULL_TIME_WORKING_HOURS * WAGE_PER_HOUR
    }else if(empAttendance == PART_TIME){
        return PART_TIME_WORKING_HOURS * WAGE_PER_HOUR
    }else {
        return 0
    }
}