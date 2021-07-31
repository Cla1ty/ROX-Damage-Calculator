package com.github.cla1ty.rox.stats

data class StatUpData(
    val str: Float = 0f,
    val agi: Float = 0f,
    val vit: Float = 0f,
    val int: Float = 0f,
    val dex: Float = 0f,
    val lux: Float = 0f,
) {
    fun plus(data: StatUpData) = StatUpData(
        str = str + data.str,
        agi = agi + data.agi,
        vit = vit + data.vit,
        int = int + data.int,
        dex = dex + data.dex,
        lux = lux + data.lux,
    )

    fun refine(level: Int) = StatUpData(
        str = str * level,
        agi = agi * level,
        vit = vit * level,
        int = int * level,
        dex = dex * level,
        lux = lux * level,
    )
}