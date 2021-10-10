package com.employeewage

class EmployeeWage() : EmployeeBuilder {
//    var companyList = mutableListOf<CompanyWage>()
    var companyList : ArrayList<CompanyWage> = ArrayList()
    var map : HashMap<String,CompanyWage> = HashMap()

    override fun addCompany(company : String, wagePerHour : Int, workingHoursPerDay : Int, noOfWorkingDays : Int, noOfWorkingHoursPerMonth : Int){
        var newCompany = CompanyWage(company,wagePerHour,workingHoursPerDay,noOfWorkingDays,noOfWorkingHoursPerMonth)
        companyList.add(newCompany)
        map[company] = newCompany
    }

    override fun compute(){
        for (company in companyList){
            company.totalWage = computeWage(company)
            println(company)
        }
    }

    override fun getCompanyTotalWage(companyName: String) : Int{
        return map[companyName]?.totalWage ?: -1
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
            companyWage.dailyWageList.add(dailywage)
        }
        println("\nTotal days worked : $totalDays")
        println("Total hours worked : $totalHours")
        println(companyWage.dailyWageList)
        return totalWage
    }
}