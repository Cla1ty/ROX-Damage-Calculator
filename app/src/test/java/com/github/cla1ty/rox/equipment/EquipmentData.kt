package com.github.cla1ty.rox

import com.github.cla1ty.rox.stats.*

/**
 * Created by Dwi Ariyanto on 29/06/21
 * Copyright (c) 2021 Jakmall Digital Niaga. All rights reserved.
 */

val weaponLevel = arrayOf(20, 40, 40, 40, 40)
val armorLevel = arrayOf(10, 20, 20, 20, 20)
val accLevel = arrayOf(5, 10, 10, 10, 10)

enum class EquipmentType {
    WEAPON,
    ARMOR,
    ACC
}

data class EquipmentData(
    val equipmentType: EquipmentType,
    val statData: StatData = StatData(),
    val baseStatData: BaseStatData = BaseStatData(),
    val upgradeStatData: StatData = StatData(),
    val upgradeBaseStatData: BaseStatData = BaseStatData(),
    val refineStatData: StatUpData = StatUpData(),
    val refineFinalStatData: FinalStatData = FinalStatData()
) {
    fun calculateUpgradeStat(level: Int, upgradeAwakening: Float) = when(equipmentType) {
        EquipmentType.WEAPON -> upgradeStatData.upgrade(level, upgradeAwakening, weaponLevel)
        EquipmentType.ARMOR -> upgradeStatData.upgrade(level, upgradeAwakening, armorLevel)
        EquipmentType.ACC -> upgradeStatData.upgrade(level, upgradeAwakening, accLevel)
    }

    fun calculateUpgradeBaseStat(level: Int, upgradeAwakening: Float) = when(equipmentType) {
        EquipmentType.WEAPON -> upgradeBaseStatData.upgrade(level, upgradeAwakening, weaponLevel)
        EquipmentType.ARMOR -> upgradeBaseStatData.upgrade(level, upgradeAwakening, armorLevel)
        EquipmentType.ACC -> upgradeBaseStatData.upgrade(level, upgradeAwakening, accLevel)
    }
}





