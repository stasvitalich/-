import java.util.Dictionary

fun GetIncomeTaxes(yourSalary: Int): Double {
    val taxRate: Double = 0.13
    var totalTax: Double = yourSalary * taxRate
    return totalTax
}

fun GetPensionFund(yourSalary: Int): Double {
    val pensionMoney: Double = 0.22
    var totalPension: Double = pensionMoney * yourSalary
    return totalPension
}

fun GetSocialEnsFund(yourSalary: Int): Double {
    val socialFund: Double = 0.029
    var totalSocial: Double = socialFund * yourSalary
    return totalSocial
}

fun GetMedicineMoney(yourSalary: Int): Double {
    val medicineMoney: Double = 0.051
    var totalMedicine: Double = medicineMoney * yourSalary
    return totalMedicine
}

fun GetAccidentMoney(yourSalary: Int): Double {
    val accidentMoney: Double = 0.002
    var totalAccident: Double = accidentMoney * yourSalary
    return totalAccident
}

fun main() {
    println("Зарплата, которую вам платит работодатель по документам: ")
    var inputNumber1: String? = readLine()
    if (inputNumber1 == null) return
    var yourSalary: Int = inputNumber1.toInt()
    // println("Ваш чистый доход составляет $yourSalary")
    println(" ")
    var taxResult: Double = GetIncomeTaxes(yourSalary)
    println("13% подоходного налога от вашей ЗП: $taxResult руб.")

    var pensionResult: Double = GetPensionFund(yourSalary)
    println("22% в качестве взноса в пенсионный фонд от вашей зп: $pensionResult руб.")

    var socialFundResult: Double = GetSocialEnsFund(yourSalary)
    println("2.9% взнос в фонд социального страхования от вашей зп: $socialFundResult руб.")

    var medicineFundResult: Double = GetMedicineMoney(yourSalary)
    println("5.1% взнос в фонд обязательно мед. страхования от вашей зп: $medicineFundResult руб.")

    var accidentMoneyResult: Double = GetAccidentMoney(yourSalary)
    println("0.2% взнос на страхование от несчастных случаев от вашей зп $accidentMoneyResult руб.")

    println("43,2% итоговая налоговая ставка с ЗП без учёта НДС и акцизов, которые вы заплатите, покупая товары и услуги")

    println("")

    var totalSalaryToHand: Double =
        yourSalary - taxResult - pensionResult - socialFundResult - medicineFundResult - accidentMoneyResult
    println("На руки после вычета налогов вы получите: $totalSalaryToHand руб.")

    var totalTaxesPerMonth: Double = yourSalary - totalSalaryToHand
    println("За 1 месяц государство получит от вас налогов: $totalTaxesPerMonth руб.")

    var totalTaxesPerYear: Double = totalTaxesPerMonth * 12
    println("За 1 год государство получит от вас налогов: $totalTaxesPerYear руб.")

    var totalSalaryPerYear: Double = totalSalaryToHand * 12
    println("За 1 год вы получите на руки: $totalSalaryPerYear")

    var difference: Double = totalSalaryPerYear - totalTaxesPerYear
    println("За год вы заработаете на $difference больше руб., чем заплатите налогов в казну")
}