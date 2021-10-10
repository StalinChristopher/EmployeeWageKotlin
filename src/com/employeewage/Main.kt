package com.main

import com.employeewage.*

fun main(){
    println("Welcome to employee wage problem")
    var tcs : EmployeeWage = EmployeeWage("TCS",25,8,20,80)
    tcs.computeWage()
    println(tcs)
    println()
    var jio : EmployeeWage = EmployeeWage("JIO",15,10,25,110)
    jio.computeWage()
    println(jio)

}