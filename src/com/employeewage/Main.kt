package com.main

import com.employeewage.*

fun main(){
    println("Welcome to employee wage problem")
    var employeeWage = EmployeeWage()
    employeeWage.addCompany("TCS",20,8,24,80)
    employeeWage.addCompany("Jio",15,10,27,110)
    employeeWage.compute()
    var comanyName = "Jio"
    var totalWage = employeeWage.getCompanyTotalWage(comanyName)
    if(totalWage == -1){
        println("given company $comanyName not found")
    }else{
        println("TotalWage of given $comanyName is $totalWage")
    }

}