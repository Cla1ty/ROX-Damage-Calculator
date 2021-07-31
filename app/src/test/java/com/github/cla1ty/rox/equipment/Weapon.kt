package com.github.cla1ty.rox.equipment

import com.github.cla1ty.rox.EquipmentData
import com.github.cla1ty.rox.EquipmentType
import com.github.cla1ty.rox.stats.BaseStatData
import com.github.cla1ty.rox.stats.FinalStatData

/**
 * Created by Dwi Ariyanto on 29/06/21
 * Copyright (c) 2021 Jakmall Digital Niaga. All rights reserved.
 */

object Weapon {
    object White {
        val LEVEL_25_P_ATK_ASPD = EquipmentData(
            equipmentType = EquipmentType.WEAPON,
            baseStatData = BaseStatData(
                pAtk = 125f,
                aspd = 62f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 5f,
                aspd = 2.5f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 10f,
                aspd = 25f
            )
        )

        val LEVEL_40_P_ATK_ASPD = EquipmentData(
            equipmentType = EquipmentType.WEAPON,
            baseStatData = BaseStatData(
                pAtk = 200f,
                aspd = 100f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 5f,
                aspd = 2.5f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 10f,
                aspd = 25f
            )
        )

        val LEVEL_50_P_ATK_ASPD = EquipmentData(
            equipmentType = EquipmentType.WEAPON,
            baseStatData = BaseStatData(
                pAtk = 275f,
                aspd = 137f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 5f,
                aspd = 2.5f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 10f,
                aspd = 25f
            )
        )

        val LEVEL_60_P_ATK_ASPD = EquipmentData(
            equipmentType = EquipmentType.WEAPON,
            baseStatData = BaseStatData(
                pAtk = 375f,
                aspd = 187f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 5f,
                aspd = 2.5f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 10f,
                aspd = 25f
            )
        )

        val LEVEL_70_P_ATK_ASPD = EquipmentData(
            equipmentType = EquipmentType.WEAPON,
            baseStatData = BaseStatData(
                pAtk = 475f,
                aspd = 237f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 5f,
                aspd = 2.5f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 10f,
                aspd = 25f
            )
        )

        val LEVEL_80_P_ATK_ASPD = EquipmentData(
            equipmentType = EquipmentType.WEAPON,
            baseStatData = BaseStatData(
                pAtk = 600f,
                aspd = 300f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 5f,
                aspd = 2.5f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 10f,
                aspd = 25f
            )
        )
    }

    object Blue {
        val LEVEL_30 = EquipmentData(
            equipmentType = EquipmentType.WEAPON,
            baseStatData = BaseStatData(
                pAtk = 187f,
                aspd = 93f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 5f,
                aspd = 2.5f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 15f,
                aspd = 37.5f
            )
        )

        val LEVEL_40 = EquipmentData(
            equipmentType = EquipmentType.WEAPON,
            baseStatData = BaseStatData(
                pAtk = 300f,
                aspd = 150f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 5f,
                aspd = 2.5f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 15f,
                aspd = 37.5f
            )
        )

        val LEVEL_50 = EquipmentData(
            equipmentType = EquipmentType.WEAPON,
            baseStatData = BaseStatData(
                pAtk = 412f,
                aspd = 206f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 5f,
                aspd = 2.5f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 15f,
                aspd = 37.5f
            )
        )

        val LEVEL_60 = EquipmentData(
            equipmentType = EquipmentType.WEAPON,
            baseStatData = BaseStatData(
                pAtk = 562f,
                aspd = 281f,
            ),
            upgradeBaseStatData = BaseStatData(
                pAtk = 5f,
                aspd = 2.5f,
            ),
            refineFinalStatData = FinalStatData(
                pAtk = 15f,
                aspd = 37.5f
            )
        )
    }

//    object Yellow {
//        val TIPE_1_P_ATK_ASPD = EquipmentData(
//            baseStatData = BaseStatData(
//                pAtk = 400f,
//                aspd = 200f,
//            ),
//            upgradeData = BaseStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                pAtk = 10f,
//                aspd = 25f
//            )
//        )
//
//        val TIPE_2_P_ATK_ASPD = EquipmentData(
//            baseStatData = BaseStatData(
//                pAtk = 750f,
//                aspd = 375f,
//            ),
//            upgradeData = BaseStatData(
//                pAtk = 0f,
//                aspd = 0f,
//            ),
//            refineFinalStatData = FinalStatData(
//                pAtk = 10f,
//                aspd = 25f
//            )
//        )
//    }
}