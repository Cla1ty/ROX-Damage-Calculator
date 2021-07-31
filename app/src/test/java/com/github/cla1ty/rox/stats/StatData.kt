package com.github.cla1ty.rox.stats

import kotlin.math.ceil

data class StatData(
    val str: Float = 0f,
    val agi: Float = 0f,
    val vit: Float = 0f,
    val int: Float = 0f,
    val dex: Float = 0f,
    val lux: Float = 0f,
) {
    fun plus(data: StatData) = StatData(
        str = str + data.str,
        agi = agi + data.agi,
        vit = vit + data.vit,
        int = int + data.int,
        dex = dex + data.dex,
        lux = lux + data.lux,
    )

    fun round() = StatData(
        str = (str).toInt().toFloat(),
        agi = (agi).toInt().toFloat(),
        vit = (vit).toInt().toFloat(),
        int = (int).toInt().toFloat(),
        dex = (dex).toInt().toFloat(),
        lux = (lux).toInt().toFloat(),
    )

    fun upgrade(level: Int, upgradeAwakening: Float, listLevel: Array<Int>): StatData {
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

    private fun upgrade(level: Int, upgradeAwakening: Float) = StatData(
        str = str * level * (1 + upgradeAwakening),
        agi = agi * level * (1 + upgradeAwakening),
        vit = vit * level * (1 + upgradeAwakening),
        int = int * level * (1 + upgradeAwakening),
        dex = dex * level * (1 + upgradeAwakening),
        lux = lux * level * (1 + upgradeAwakening),
    )

    fun calculateStatUp(data: StatUpData) = StatData(
        str = (str * (1 + data.str / 100f)),
        agi = (agi * (1 + data.agi / 100f)),
        vit = (vit * (1 + data.vit / 100f)),
        int = (int * (1 + data.int / 100f)),
        dex = (dex * (1 + data.dex / 100f)),
        lux = (lux * (1 + data.lux / 100f)),
    )

    fun toBaseStat() = BaseStatData(
        maxHp = (vit * 180.4f),
        maxSp = (int * 13.82f).toInt().toFloat(),
        pAtk = ((str * 4) + ((str / 100).toInt()
            .toFloat() * 20) + ceil(lux * 0.5f) + (dex * 0.2f).toInt()
            .toFloat()), // 100 = 20 atk
        mAtk = (int * 4),
        pDef = (vit * 2),
        mDef = (int * 2),
        pPen = 0f,
        mPen = 0f,
        aspd = (agi * 2),
        haste = (dex * 2),
        hit = (dex * 2),
        flee = (agi * 2),
        crit = (lux * 2) + ((lux / 100).toInt().toFloat() * 10),
        antiCrit = (lux * 2) + ((lux / 100).toInt().toFloat() * 10),
        pDmg = 0f,
    )
}