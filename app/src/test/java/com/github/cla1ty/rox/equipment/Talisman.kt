package com.github.cla1ty.rox.equipment

import com.github.cla1ty.rox.EquipmentData
import com.github.cla1ty.rox.EquipmentType
import com.github.cla1ty.rox.stats.BaseStatData
import com.github.cla1ty.rox.stats.FinalStatData
import com.github.cla1ty.rox.stats.StatData
import com.github.cla1ty.rox.stats.StatUpData

/**
 * Created by Dwi Ariyanto on 29/06/21
 * Copyright (c) 2021 Jakmall Digital Niaga. All rights reserved.
 */

object Talisman {
    object White {
        val LEVEL_25_ASPD = EquipmentData(
            equipmentType = EquipmentType.ACC,
            baseStatData = BaseStatData(
                aspd = 75f,
            ),
            upgradeBaseStatData = BaseStatData(
                aspd = 12f,
            ),
            refineFinalStatData = FinalStatData(
                aspd = 20f,
            )
        )

        val LEVEL_40_P_ATK = EquipmentData(
            equipmentType = EquipmentType.ACC,
            baseStatData = BaseStatData(
                pAtk = 120f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 12f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 4f,
            )
        )

//        val LEVEL_50_P_PEN = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            baseData = BaseStatData(
//                pPen = 165f,
//            ),
//            upgradeData = BaseStatData(
//                pPen = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                pPen = 0f,
//            )
//        )
//
//
//        val LEVEL_60_P_DMG = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            baseData = BaseStatData(
//                pDmg = 690f,
//            ),
//            upgradeData = BaseStatData(
//                pDmg = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                pDmg = 0f,
//            )
//        )
//
//
//        val LEVEL_70_CRIT = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            baseData = BaseStatData(
//                crit = 285f,
//            ),
//            upgradeData = BaseStatData(
//                crit = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                crit = 0f,
//            )
//        )
//
//
//        val LEVEL_80_P_ATK = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            baseData = BaseStatData(
//                pAtk = 360f,
//            ),
//            upgradeData = BaseStatData(
//                pAtk = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                pAtk = 0f,
//            )
//        )
    }

    object Blue {
        val LEVEL_30_STR_LUX = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                str = 9f,
                lux = 9f,
            ),
            upgradeStatData = StatData(
                str = 1f,
                lux = 1f,
            ),
            refineStatData = StatUpData(
                str = 1.2f,
                lux = 1.2f,
            )
        )

        val LEVEL_30_AGI_LUX = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                agi = 9f,
                lux = 9f,
            ),
            upgradeStatData = StatData(
                agi = 1f,
                lux = 1f,
            ),
            refineStatData = StatUpData(
                agi = 1.2f,
                lux = 1.2f,
            )
        )

        val LEVEL_40_STR_LUX = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                str = 15f,
                lux = 15f,
            ),
            upgradeStatData = StatData(
                str = 1f,
                lux = 1f,
            ),
            refineStatData = StatUpData(
                str = 1.2f,
                lux = 1.2f,
            )
        )
//
//        val LEVEL_40_AGI_LUX = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            statStatData = StatData(
//                agi = 15f,
//                lux = 15f,
//            ),
//            upgradeStatData = StatData(
//                agi = 0f,
//                lux = 0f,
//            ),
//            refineStatData = StatUpData(
//                agi = 1.2f,
//                lux = 1.2f,
//            )
//        )
//
//        val LEVEL_50_STR_LUX = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            statStatData = StatData(
//                str = 21f,
//                lux = 21f,
//            ),
//            upgradeStatData = StatData(
//                str = 0f,
//                lux = 0f,
//            ),
//            refineStatData = StatUpData(
//                str = 1.2f,
//                lux = 1.2f,
//            )
//        )
//
//        val LEVEL_50_AGI_LUX = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            statStatData = StatData(
//                agi = 21f,
//                lux = 21f,
//            ),
//            upgradeStatData = StatData(
//                agi = 0f,
//                lux = 0f,
//            ),
//            refineStatData = StatUpData(
//                agi = 1.2f,
//                lux = 1.2f,
//            )
//        )
//
//        val LEVEL_60_STR_LUX = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            statStatData = StatData(
//                str = 28f,
//                lux = 28f,
//            ),
//            upgradeStatData = StatData(
//                str = 0f,
//                lux = 0f,
//            ),
//            refineStatData = StatUpData(
//                str = 1.2f,
//                lux = 1.2f,
//            )
//        )
//
//        val LEVEL_60_AGI_LUX = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            statStatData = StatData(
//                agi = 28f,
//                lux = 28f,
//            ),
//            upgradeStatData = StatData(
//                agi = 0f,
//                lux = 0f,
//            ),
//            refineStatData = StatUpData(
//                agi = 1.2f,
//                lux = 1.2f,
//            )
//        )
    }
}
