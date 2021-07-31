package com.github.cla1ty.rox.stats

data class BaseStatUpData(
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
    fun plus(data: Array<BaseStatUpData>) : BaseStatUpData {
        var newData = this
        data.forEach {
            newData = newData.plus(it)
        }
        return newData
    }

    fun plus(data: BaseStatUpData) : BaseStatUpData{
        return BaseStatUpData(
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

    fun upgrade(level: Int, listLevel: Array<Int>): BaseStatUpData {
        var totalUpgrade = 0
        var curLevel = level
        listLevel.forEachIndexed { index, value ->
            if (value <= curLevel) {
                curLevel -= value
                totalUpgrade += ((index + 1) * value)
            } else {
                totalUpgrade += ((index + 1) * curLevel)
                return upgrade(totalUpgrade)
            }
        }
        return upgrade(totalUpgrade)
    }

    private fun upgrade(level: Int) : BaseStatUpData{
        return BaseStatUpData(
            maxHp = maxHp * level,
            maxSp = maxSp * level,
            pAtk = pAtk * level,
            mAtk = mAtk * level,
            pDef = pDef * level,
            mDef = mDef * level,
            pPen = pPen * level,
            mPen = mPen * level,
            aspd = aspd * level,
            haste = haste * level,
            hit = hit * level,
            flee = flee * level,
            crit = crit * level,
            antiCrit = antiCrit * level,
            pDmg = pDmg * level,
        )
    }

    fun calculateBaseStatUp(data: FinalStatData) : BaseStatUpData{
        return BaseStatUpData(
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