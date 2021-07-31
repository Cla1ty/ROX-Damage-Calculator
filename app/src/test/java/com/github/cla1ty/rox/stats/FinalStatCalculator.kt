package com.github.cla1ty.rox.stats

object FinalStatCalculator {
    var crit = 0.05f;
    var critStat = arrayOf(25, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500)
    fun getCritStat(critPoin: Float) = getPercentage(critPoin, crit, critStat)

    var asdp = 0.5f;
    var asdpStat = arrayOf(50, 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650, 700, 750, 800, 850, 900, 950, 1000)
    fun getAsdpStat(asdpPoin: Float) = getPercentage(asdpPoin, asdp, asdpStat)

    var base = 10f
    var baseStat = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    fun getBaseStat(poin: Float) = getPercentage(poin, base, baseStat, true)


    private fun getPercentage(
        stat: Float,
        statValue: Float,
        listStat: Array<Int>,
        log: Boolean = false
    ): Float {
        var selectIndex = 0;
        var curStat = stat
        listStat.forEachIndexed { index, value ->
            if (value <= curStat) {
                curStat -= value
                selectIndex = index + 1
            }
        }
        if (log) println("left stat $curStat")
        if (selectIndex == -1) return statValue / listStat[selectIndex] * curStat
        return statValue * selectIndex + statValue / listStat[selectIndex] * curStat
    }
}