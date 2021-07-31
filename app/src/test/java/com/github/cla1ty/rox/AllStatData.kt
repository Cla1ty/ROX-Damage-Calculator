package com.github.cla1ty.rox

import com.github.cla1ty.rox.stats.*

data class AllStatData(
    val statData: StatData = StatData(),
    val statUpData: StatUpData = StatUpData(),
    val baseStatData: BaseStatData = BaseStatData(),
    val baseStatUpData: BaseStatUpData = BaseStatUpData(),
    val finalStatData: FinalStatData = FinalStatData()
) {
    fun plus(
        statData: StatData = StatData(),
        statUpData: StatUpData = StatUpData(),
        baseStatData: BaseStatData = BaseStatData(),
        baseStatUpData: BaseStatUpData = BaseStatUpData(),
        finalStatData: FinalStatData = FinalStatData()
    ) = AllStatData(
        statData = this.statData.plus(statData),
        statUpData = this.statUpData.plus(statUpData),
        baseStatData = this.baseStatData.plus(baseStatData),
        baseStatUpData = this.baseStatUpData.plus(baseStatUpData),
        finalStatData = this.finalStatData.plus(finalStatData)
    )

    fun plus(equipmentData: EquipmentData, upgrade: Int, upgradeAwakening: Float, refine: Int) = AllStatData(
        statData = statData.plus(equipmentData.statData)
            .plus(equipmentData.calculateUpgradeStat(upgrade, upgradeAwakening)),
        statUpData = statUpData.plus(equipmentData.refineStatData.refine(refine)),
        baseStatData = baseStatData.plus(equipmentData.baseStatData)
            .plus(equipmentData.calculateUpgradeBaseStat(upgrade, upgradeAwakening)),
        finalStatData = finalStatData.plus(equipmentData.refineFinalStatData.refine(refine))
    )

    fun calculateTotalFinalStat(): FinalStatData {
        val totalStatData = statData.calculateStatUp(statUpData).round()
        println("totalStatData= ${totalStatData}")

        val totalBaseStatData = totalStatData.toBaseStat()
                .plus(baseStatData)
                .calculateBaseStatUp(baseStatUpData)
        println("totalBaseStatData= ${totalBaseStatData}")

        println("finalStatData= ${finalStatData}")

        return FinalStatData(
            maxHp = totalBaseStatData.maxHp * (1 + finalStatData.maxHp / 100f),
            maxSp = totalBaseStatData.maxSp * (1 + finalStatData.maxSp / 100f),
            pAtk = totalBaseStatData.pAtk * (1 + finalStatData.pAtk / 100f),
            mAtk = totalBaseStatData.mAtk * (1 + finalStatData.mAtk / 100f),
//            pDef = totalBaseStatData.pDef + (1 + finalStatData.pDef / 100f),
//            mDef = totalBaseStatData.mDef + (1 + finalStatData.mDef / 100f),
//            pPen = totalBaseStatData.pPen + (1 + finalStatData.pPen / 100f),
//            mPen = totalBaseStatData.mPen + (1 + finalStatData.mPen / 100f),
            aspd = FinalStatCalculator.getAsdpStat(totalBaseStatData.aspd) + (finalStatData.aspd / 100f),
//            haste = totalBaseStatData.haste + (1 + finalStatData.haste / 100f),
//            hit = totalBaseStatData.hit + (1 + finalStatData.hit / 100f),
//            flee = totalBaseStatData.flee + (1 + finalStatData.flee / 100f),
            crit = FinalStatCalculator.getCritStat(totalBaseStatData.crit) + (finalStatData.crit / 100f),
//            antiCrit = totalBaseStatData.antiCrit + (1 + finalStatData.antiCrit / 100f),
            pDmg = totalBaseStatData.pDmg * (1 + finalStatData.pDmg / 100f),

            )
    }
}