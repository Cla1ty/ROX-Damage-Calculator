package com.github.cla1ty.rox

import com.github.cla1ty.rox.equipment.Accessory
import com.github.cla1ty.rox.equipment.Talisman
import com.github.cla1ty.rox.equipment.Weapon
import com.github.cla1ty.rox.stats.BaseStatData
import com.github.cla1ty.rox.stats.BaseStatUpData
import com.github.cla1ty.rox.stats.FinalStatData
import com.github.cla1ty.rox.stats.StatData
import org.junit.Test

/**
 * Created by Dwi Ariyanto on 29/06/21
 * Copyright (c) 2021 Jakmall Digital Niaga. All rights reserved.
 */

object DamageCalculator {
    fun calculate(data: FinalStatData) {
        val atk = data.pAtk
        val asdp = data.aspd
        val crit = data.crit
        val normalAtk = (atk * asdp).toInt()
        val critAtk = (atk * asdp * crit * 2).toInt()

        println("=======================================================")
        println("Atk = ${atk}, Asdp = ${asdp}, ${crit}")
        println("damage = ${normalAtk} + ${critAtk} + ${data.pDmg} = ${normalAtk + critAtk + data.pDmg}")
        println("f = ${(normalAtk + critAtk + data.pDmg) * 60}")

    }

    fun calculate(
        charStat: StatData,
        charBaseStat: BaseStatData,
        charFinalStatData: FinalStatData,
        upgradeAwakening: Float,
        weapon: EquipmentData = EquipmentData(EquipmentType.WEAPON),
        weaponUpgradeLevel: Int = 0,
        weaponRefineLevel: Int = 0,
        talisman: EquipmentData = EquipmentData(EquipmentType.ACC),
        talismanUpgradeLevel: Int = 0,
        talismanRefineLevel: Int = 0,
        acc1: EquipmentData = EquipmentData(EquipmentType.ACC),
        acc1UpgradeLevel: Int = 0,
        acc1RefineLevel: Int = 0,
        acc2: EquipmentData = EquipmentData(EquipmentType.ACC),
        acc2UpgradeLevel: Int = 0,
        acc2RefineLevel: Int = 0,
        enchantStat: StatData = StatData(),
        enchantBaseStat: BaseStatData = BaseStatData(),
        skill: BaseStatUpData = BaseStatUpData(),
        cardBaseStats: Array<BaseStatData> = emptyArray(),
        cardFinalStats: Array<FinalStatData> = emptyArray()
    ) {
        val totalFinalStat = AllStatData()
            .plus(
                statData = charStat,
                baseStatData = charBaseStat,
                finalStatData = charFinalStatData
            )
            .plus(weapon, weaponUpgradeLevel, upgradeAwakening, weaponRefineLevel)
            .plus(talisman, talismanUpgradeLevel, upgradeAwakening, talismanRefineLevel)
            .plus(acc1, acc1UpgradeLevel, upgradeAwakening, acc1RefineLevel)
            .plus(acc2, acc2UpgradeLevel, upgradeAwakening, acc2RefineLevel)
            .plus(statData = enchantStat, baseStatData = enchantBaseStat)
            .plus(baseStatUpData = skill)
            .plus(
                baseStatData = BaseStatData().plus(cardBaseStats),
                finalStatData = FinalStatData().plus(cardFinalStats)
            )
            .calculateTotalFinalStat()

        calculate(totalFinalStat)
    }
}

class Rox {
    var bonusJob = StatData(
        str = 9f + 4,
        agi = 11f,
        vit = 4f,
        int = 5f,
        dex = 9f,
        lux = 4f
    )

    var statUpgrade = StatData(
        str = 1f + 49,//53,
        agi = 1f + 34,//41,
        vit = 1f,
        int = 1f,
        dex = 1f,
        lux = 1f + 38//11
    )

    var titleStat = StatData(
        agi = 3f,
    )

    var titleBaseStat = BaseStatData(
        maxHp = 90f,
        maxSp = 10f,
        aspd = 3f,
        pPen = 1f,
        antiCrit = 1f,
    )

    fun charBaseStat(levelJob: Int) = BaseStatData(
        maxHp = 18564f,
        maxSp = 1383f,
        pAtk = levelJob * 4f,
        pDef = 149f,
        mDef = 149f,
        hit = levelJob * 1f,
        flee = levelJob * 1f,
    )

    val WHITE_CRIT = BaseStatData(crit = 60f)
    val WHITE_PATK = BaseStatData(pAtk = 60f)
    val WHITE_ASPD = BaseStatData(aspd = 60f)
    val WHITE_PATK_PDMG = BaseStatData(pAtk = 60f, pDmg = 120f)

    val BLUE_PATK = FinalStatData(pAtk = 6f)

    val skill = BaseStatUpData(
        crit = 100f
    )

    val enchantStatWeapon = StatData(str = 18f * 0)
    val enchantStatArmor = StatData(str = 18f * 0)
    val enchantStatAcc = StatData(str = 18f * 0)

    val enchantBaseStatWeapon = BaseStatData(
        pAtk = 54f * 3,
        pDmg = 162f * 2,
    )

    //    val enchantBaseStatArmor = BaseStatData(aspd = 180f)
    val enchantBaseStatAcc = BaseStatData(
        aspd = 54f * 2,
        crit = 54f * 3
    )

    val costumeBaseStatData = BaseStatData(
        pDef = 4f
    )
    val costumeFinalStatData = FinalStatData(
        pAtk = 2f,
        mAtk = 2f
    )

    @Test
    fun main() {
        DamageCalculator.calculate(
            charStat = bonusJob.plus(statUpgrade).plus(titleStat),
            charBaseStat = charBaseStat(56).plus(titleBaseStat),
            charFinalStatData = costumeFinalStatData,
            upgradeAwakening = 0.3f,
            weapon = Weapon.Blue.LEVEL_40,
            weaponUpgradeLevel = 100,
            weaponRefineLevel = 4,
            talisman = Talisman.White.LEVEL_40_P_ATK,
            talismanUpgradeLevel = 15,
            talismanRefineLevel = 4,
            acc1 = Accessory.White.LEVEL_40_CRIT,
            acc1UpgradeLevel = 25,
            acc1RefineLevel = 4,
            acc2 = Accessory.White.LEVEL_40_CRIT,
            acc2UpgradeLevel = 25,
            acc2RefineLevel = 4,
            enchantStat = enchantStatWeapon.plus(enchantStatArmor).plus(enchantStatAcc),
            enchantBaseStat = enchantBaseStatWeapon.plus(enchantBaseStatAcc),
            skill = skill,
            cardBaseStats = arrayOf(
                WHITE_PATK,
                WHITE_ASPD,
//                WHITE_CRIT,
                WHITE_PATK_PDMG
            ),
            cardFinalStats = arrayOf(
                BLUE_PATK
            )

        )
    }
}

/**
none
Atk = 4238.08, Asdp = 3.3775, 0.50355554
damage = 14314 + 14415 + 444.0 = 29173.0
f = 1750380.0

awak 2
Atk = 4697.0, Asdp = 3.5133333, 0.52088886
damage = 16502 + 17191 + 444.0 = 34137.0
f = 2048220.0

awak 3
Atk = 6127.6597, Asdp = 3.87, 0.598
damage = 23714 + 28361 + 444.0 = 52519.0
f = 3151140.0

ref 4
Atk = 6100.0, Asdp = 4.2633333, 0.60088885
damage = 26006 + 31253 + 444.0 = 57703.0
f = 3462180.0

awak 3 ref 4
Atk = 7958.0, Asdp = 4.62, 0.678
damage = 36765 + 49854 + 444.0 = 87063.0
f = 5223780.0

 */
