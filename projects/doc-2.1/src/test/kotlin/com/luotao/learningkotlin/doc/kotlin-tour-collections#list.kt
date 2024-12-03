package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

// https://kotlinlang.org/docs/kotlin-tour-collections.html#list
class `kotlin-tour-collections#list` {
    @Test
    fun _01() {
        val list01: List<Int> = listOf(1, 2, 3)

        val list02: MutableList<Int> = mutableListOf(1, 2, 3)
    }

    /** 通过索引访问 List 的元素. */
    @Test
    fun _02() {
        var list01 = listOf<Int>(1, 2, 3)
        assertEquals(2, list01[1])
    }

    @Test
    fun _03() {
        var list01 = listOf<Int>(1, 2, 3)
        assertEquals(1, list01.first())
        assertEquals(3, list01.last())
        assertEquals(3, list01.count())
    }

    /** 判断某个元素是否在集合中. */
    @Test
    fun _04() {
        var list01 = listOf<Int>(1, 2, 3)

        assertTrue(1 in list01)
        assertTrue(4 !in list01)
    }

    /** 添加元素, 删除元素. */
    @Test
    fun _05() {
        var list01 = mutableListOf<Int>(1, 2, 3)

        list01.add(4)
        list01.add(5)

        list01.remove(4)

        assertEquals(4, list01.size)
        assertEquals("[1, 2, 3, 5]", list01.toString())
    }
}
