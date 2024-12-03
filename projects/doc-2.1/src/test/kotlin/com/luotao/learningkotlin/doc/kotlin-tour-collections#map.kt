package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/kotlin-tour-collections.html#map
class `kotlin-tour-collections#map` {
    @Test
    fun _01() {
        var map01: MutableMap<Int, String> = mutableMapOf(1 to "A", 2 to "B", 3 to "C")

        // 通过索引访问元素,
        assertEquals("A", map01[1])

        // 通过索引设置元素,
        map01[5] = "E"
        assertEquals("E", map01[5])

        // 访问不存在的 key, 返回 null,
        assertEquals(null, map01[4])

        assertEquals("{1=A, 2=B, 3=C, 5=E}", map01.toString())
    }

    @Test
    fun _02() {
        var map01 = mutableMapOf(1 to "A", 2 to "B", 3 to "C")

        assertEquals("{1=A, 2=B, 3=C}", map01.toString())

        // 删除一个元素,
        map01.remove(2)
        assertEquals("{1=A, 3=C}", map01.toString())

        assertEquals(2, map01.count())
    }
}
