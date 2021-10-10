package com.main

import com.employeewage.*

fun main(){
    println("Welcome to employee wage problem")
    var employeeWage = EmployeeWage()
    employeeWage.addCompany("TCS",20,8,24,80)
    employeeWage.addCompany("Jio",15,10,27,110)
    employeeWage.compute()

}