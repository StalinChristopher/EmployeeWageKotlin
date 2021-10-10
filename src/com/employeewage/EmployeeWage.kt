package com.employeewage

class EmployeeWage() : EmployeeBuilder {
//    var companyList = mutableListOf<CompanyWage>()
    var companyList : ArrayList<CompanyWage> = ArrayList()

    override fun addCompany(company : String, wagePerHour : Int, workingHoursPerDay : Int, noOfWorkingDays : Int, noOfWorkingHoursPerMonth : Int){
        companyList.add(CompanyWage(company,wagePerHour,workingHoursPerDay,noOfWorkingDays,noOfWorkingHoursPerMonth))
    }

    override fun compute(){
        for (company in companyList){
            company.totalWage = computeWage(company)
            println(company)
        }
    }

    private fun computeWage(companyWage: CompanyWage) :Int{
        var totalDays = 0
        var totalHours = 0
        var totalWage = 0
        while(totalDays < companyWage.noOfWorkingDays  && totalHours < companyWage.noOfWorkingHoursPerMonth) {
            totalDays++
            println("\nDay $totalDays")
            var empType = CheckAttendance.attendance()
            var result = DailyWage.dailyWage(empType, companyWage.wagePerHour, companyWage.workingHoursPerDay)
            var dailywage = result.first
            var workingHours = result.second
            totalHours += workingHours
            totalWage += dailywage
            println("Hours worked today : $workingHours \tWages earned today : $dailywage ")
        }
        println("\nTotal days worked : $totalDays")
        println("Total hours worked : $totalHours")
        return totalWage
    }
}