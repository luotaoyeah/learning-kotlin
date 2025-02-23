package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/kotlin-tour-classes.html#copy-instance
class `kotlin-tour-classes#copy-instance` {
    @Test
    fun _01() {
        data class C01(val x: Int, val y: Int)

        val c01 = C01(1, 2)

        // data class 会自动生成一个 copy() 方法, 用来复制对象,
        val c02 = c01.copy()
        assertEquals(2, c02.y)

        // 在复制的同时, 可以通过参数修改某些属性的值,
        var c03 = c01.copy(y = 3)
        assertEquals(3, c03.y)
    }
}
