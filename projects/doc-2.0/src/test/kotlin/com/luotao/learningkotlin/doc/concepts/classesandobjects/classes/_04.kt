package com.luotao.learningkotlin.doc.concepts.classesandobjects.classes

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/classes.html#creating-instances-of-classes
class _04 {
    @Test
    fun _01() {
        class C01(val x: Int)

        // 创建类的实例不需要用 new 关键字,
        var c01 = C01(8)

        assertEquals(c01.x, 8)
    }
}
