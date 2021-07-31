package com.github.cla1ty.rox.stats

data class FinalStatData(
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

    fun plus(data: Array<FinalStatData>) : FinalStatData {
        var newData = this
        data.forEach {
            newData = newData.plus(it)
        }
        return newData
    }

    fun plus(data: FinalStatData): FinalStatData {
        return FinalStatData(
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

    fun refine(level: Int): FinalStatData {
        return FinalStatData(
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

    override fun toString(): String {
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