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

object Accessory {
    object White {
//        val LEVEL_25_P_ATK_ASPD = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            baseData = BaseStatData(
//                pAtk = 19f,
//                aspd = 19f,
//            ),
//            upgradeData = BaseStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                pAtk = 0f,
//                aspd = 0f
//            )
//        )

        val LEVEL_40_CRIT = EquipmentData(
            equipmentType = EquipmentType.ACC,
            baseStatData = BaseStatData(
                pAtk = 30f,
                crit = 30f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 3f,
                crit = 3f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 2f,
                crit = 2f,
            )
        )

//        val LEVEL_50 = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            baseData = BaseStatData(
//                pPen = 41f,
//                pDmg = 113f,
//            ),
//            upgradeData = BaseStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            )
//        )
//
//        val LEVEL_60 = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            baseData = BaseStatData(
//                pAtk = 36f,
//                pDmg = 173f,
//            ),
//            upgradeData = BaseStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            )
//        )
//
//        val LEVEL_70 = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            baseData = BaseStatData(
//                pAtk = 71f,
//                crit = 71f,
//            ),
//            upgradeData = BaseStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            )
//        )
//
//        val LEVEL_80 = EquipmentData(
//        equipmentType = EquipmentType.ACC,
//            baseData = BaseStatData(
//                pAtk = 90f,
//                aspd = 90f,
//            ),
//            upgradeData = BaseStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            )
//        )
    }

    object Blue {
        val LEVEL_30_STR = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                str = 9f
            ),
            upgradeStatData = StatData(
                str = 1f
            ),

            refineStatData = StatUpData(
                str = 2.4f
            )
        )

        val LEVEL_30_AGI = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                agi = 9f
            ),
            upgradeStatData = StatData(
                agi = 1f
            ),

            refineStatData = StatUpData(
                agi = 2.4f
            )
        )

        val LEVEL_30_LUX = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                lux = 9f
            ),
            upgradeStatData = StatData(
                lux = 1f
            ),

            refineStatData = StatUpData(
                lux = 2.4f
            )
        )

        val LEVEL_40_STR = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                str = 15f
            ),
            upgradeStatData = StatData(
                str = 1f
            ),

            refineStatData = StatUpData(
                str = 2.4f
            )
        )

        val LEVEL_40_AGI = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                agi = 15f
            ),
            upgradeStatData = StatData(
                agi = 1f
            ),

            refineStatData = StatUpData(
                agi = 2.4f
            )
        )

        val LEVEL_40_LUX = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                lux = 15f
            ),
            upgradeStatData = StatData(
                lux = 1f
            ),

            refineStatData = StatUpData(
                lux = 2.4f
            )
        )

        val LEVEL_50_STR = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                str = 21f
            ),
            upgradeStatData = StatData(
                str = 1f
            ),

            refineStatData = StatUpData(
                str = 2.4f
            )
        )

        val LEVEL_50_AGI = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                agi = 21f
            ),
            upgradeStatData = StatData(
                agi = 1f
            ),
            refineStatData = StatUpData(
                agi = 2.4f
            )
        )

        val LEVEL_50_LUX = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                lux = 21f
            ),
            upgradeStatData = StatData(
                lux = 1f
            ),

            refineStatData = StatUpData(
                lux = 2.4f
            )
        )

        val LEVEL_60_STR = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                str = 28f
            ),
            upgradeStatData = StatData(
                str = 1f
            ),

            refineStatData = StatUpData(
                str = 2.4f
            )
        )

        val LEVEL_60_AGI = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                agi = 28f
            ),
            upgradeStatData = StatData(
                agi = 1f
            ),

            refineStatData = StatUpData(
                agi = 2.4f
            )
        )

        val LEVEL_60_LUX = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                lux = 28f
            ),
            upgradeStatData = StatData(
                lux = 1f
            ),

            refineStatData = StatUpData(
                lux = 2.4f
            )
        )
    }

    object Yellow {
        val TYPE_1_STR = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                str = 20f
            ),
            upgradeStatData = StatData(
                str = 0f
            ),

            refineStatData = StatUpData(
                str = 0f
            )
        )

        val TYPE_1_AGI = EquipmentData(
            equipmentType = EquipmentType.ACC,
            statData = StatData(
                agi = 20f,
            ),
            upgradeStatData = StatData(
                agi = 0f,
            ),
            refineStatData = StatUpData(
                agi = 0f,
            )
        )

        val TYPE_2_P_ATK_CRIT = EquipmentData(
            equipmentType = EquipmentType.ACC,
            baseStatData = BaseStatData(
                pAtk = 60f,
                crit = 60f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 0f,
                crit = 0f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 0f,
                crit = 0f,
            ),
        )

        val TYPE_2_P_ATK_ASPD = EquipmentData(
            equipmentType = EquipmentType.ACC,
            baseStatData = BaseStatData(
                pAtk = 60f,
                aspd = 60f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 0f,
                aspd = 0f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 0f,
                aspd = 0f,
            ),
        )

        val TYPE_3_P_ATK_CRIT = EquipmentData(
            equipmentType = EquipmentType.ACC,
            baseStatData = BaseStatData(
                pAtk = 113f,
                crit = 113f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 0f,
                crit = 0f
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 0f,
                crit = 0f,
            ),
        )

        val TYPE_3_P_ATK_DMG = EquipmentData(
            equipmentType = EquipmentType.ACC,
            baseStatData = BaseStatData(
                pAtk = 113f,
                pDmg = 345f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 0f,
                pDmg = 0f
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 0f,
                pDmg = 0f,
            ),
        )
    }
}