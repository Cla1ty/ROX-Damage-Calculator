package com.github.cla1ty.rox.stats

data class BaseStatData(
    var maxHp: Float = 0f,
    var maxSp: Float = 0f,
    var pAtk: Float = 0f,
    var mAtk: Float = 0f,
    var pDef: Float = 0f,
    var mDef: Float = 0f,
    var pPen: Float = 0f,
    var mPen: Float = 0f,
    var aspd: Float = 0f,
    var haste: Float = 0f,
    var hit: Float = 0f,
    var flee: Float = 0f,
    var crit: Float = 0f,
    var antiCrit: Float = 0f,
    var pDmg: Float = 0f,
) {
    fun plus(data: Array<BaseStatData>) : BaseStatData {
        var newData = this
        data.forEach {
            newData = newData.plus(it)
        }
        return newData
    }

    fun plus(data: BaseStatData) : BaseStatData{
        return BaseStatData(
            maxHp = maxHp + data.maxHp,
            maxSp = maxSp + data.maxSp,
            pAtk = pAtk + data.pAtk,
            mAtk = mAtk + data.mAtk,
            pDef = pDef + data.pDef,
            mDef = mDef + data.mDef,
            pPen = pPen + data.pPen,
            mPen = mPen + data.mPen,
            aspd = aspd + data.aspd,
            haste = haste + data.haste,
            hit = hit + data.hit,
            flee = flee + data.flee,
            crit = crit + data.crit,
            antiCrit = antiCrit + data.antiCrit,
            pDmg = pDmg + data.pDmg,
        )
    }

    fun upgrade(level: Int, upgradeAwakening: Float, listLevel: Array<Int>): BaseStatData {
        var totalUpgrade = 0
        var curLevel = level
        listLevel.forEachIndexed { index, value ->
            if (value <= curLevel) {
                curLevel -= value
                totalUpgrade += ((index + 1) * value)
            } else {
                totalUpgrade += ((index + 1) * curLevel)
                return upgrade(totalUpgrade, upgradeAwakening)
            }
        }
        return upgrade(totalUpgrade, upgradeAwakening)
    }

    private fun upgrade(level: Int, upgradeAwakening: Float) : BaseStatData{
        return BaseStatData(
            maxHp = maxHp * level * (1 + upgradeAwakening),
            maxSp = maxSp * level * (1 + upgradeAwakening),
            pAtk = pAtk * level * (1 + upgradeAwakening),
            mAtk = mAtk * level * (1 + upgradeAwakening),
            pDef = pDef * level * (1 + upgradeAwakening),
            mDef = mDef * level * (1 + upgradeAwakening),
            pPen = pPen * level * (1 + upgradeAwakening),
            mPen = mPen * level * (1 + upgradeAwakening),
            aspd = aspd * level * (1 + upgradeAwakening),
            haste = haste * level * (1 + upgradeAwakening),
            hit = hit * level * (1 + upgradeAwakening),
            flee = flee * level * (1 + upgradeAwakening),
            crit = crit * level * (1 + upgradeAwakening),
            antiCrit = antiCrit * level * (1 + upgradeAwakening),
            pDmg = pDmg * level * (1 + upgradeAwakening),
        )
    }

    fun calculateBaseStatUp(data: BaseStatUpData) : BaseStatData{
        return BaseStatData(
            maxHp = (maxHp * (1 + data.maxHp / 100f)),
            maxSp =(maxSp * (1 + data.maxSp / 100f)),
            pAtk = (pAtk * (1 + data.pAtk / 100f)),
            mAtk = (mAtk * (1 + data.mAtk / 100f)),
            pDef = (pDef * (1 + data.pDef / 100f)),
            mDef = (mDef * (1 + data.mDef / 100f)),
            pPen = (pPen * (1 + data.pPen / 100f)),
            mPen = (mPen * (1 + data.mPen / 100f)),
            aspd = (aspd * (1 + data.aspd / 100f)),
            haste = (haste * (1 + data.haste / 100f)),
            hit = (hit * (1 + data.hit / 100f)),
            flee = (flee * (1 + data.flee / 100f)),
            crit = (crit * (1 + data.crit / 100f)),
            antiCrit = (antiCrit * (1 + data.antiCrit / 100f)),
            pDmg = (pDmg * (1 + data.pDmg / 100f)),
        )
    }

    override fun toString() : String {
        var text = "NominalData { "
        if (maxHp != 0f) text += ", maxHp = $maxHp"
        if (maxSp != 0f) text += ", maxSp = $maxSp"
        if (pAtk != 0f) text += ", pAtk = $pAtk"
        if (mAtk != 0f) text += ", mAtk = $mAtk"
        if (pDef != 0f) text += ", pDef = $pDef"
        if (mDef != 0f) text += ", mDef = $mDef"
        if (pPen != 0f) text += ", pPen = $pPen"
        if (mPen != 0f) text += ", mPen = $mPen"
        if (aspd != 0f) text += ", aspd = $aspd"
        if (haste != 0f) text += ", haste = $haste"
        if (hit != 0f) text += ", hit = $hit"
        if (flee != 0f) text += ", flee = $flee"
        if (crit != 0f) text += ", crit = $crit"
        if (antiCrit != 0f) text += ", antiCrit = $antiCrit"
        if (pDmg != 0f) text += ", pDmg = $pDmg"
        return "$text }"
    }
}