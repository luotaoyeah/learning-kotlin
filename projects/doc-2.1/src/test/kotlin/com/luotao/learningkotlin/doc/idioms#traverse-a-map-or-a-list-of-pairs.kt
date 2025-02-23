package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/idioms.html#traverse-a-map-or-a-list-of-pairs
class `idioms#traverse-a-map-or-a-list-of-pairs` {
    @Test
    fun _01() {
        val map01 = mapOf<Int, String>(1 to "A", 2 to "B", 3 to "C")

        // 遍历一个 map 并获取 key 和 value,
        for ((key, value) in map01) {
            println("$key: $value")
        }
    }
}
