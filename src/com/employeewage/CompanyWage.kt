package com.employeewage

data class CompanyWage(var company : String, var wagePerHour : Int, var workingHoursPerDay : Int, var noOfWorkingDays : Int, var noOfWorkingHoursPerMonth : Int) {
    var totalWage = 0
    var dailyWageList = mutableListOf<Int>()
    override fun toString(): String {
        return "Total employee wage of $company is $totalWage"
    }

}