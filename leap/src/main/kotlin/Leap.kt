class Year(gregorianYear: Int) {
    val isLeap = gregorianYear % 4 == 0 && (gregorianYear % 100 != 0 || gregorianYear % 400 == 0)
}
