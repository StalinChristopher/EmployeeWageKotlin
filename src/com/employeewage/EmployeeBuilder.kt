package com.employeewage

interface EmployeeBuilder {
    fun addCompany(company : String, wagePerHour : Int, workingHoursPerDay : Int, noOfWorkingDays : Int, noOfWorkingHoursPerMonth : Int)
    fun compute()
    fun getCompanyTotalWage(companyName : String) : Int
}