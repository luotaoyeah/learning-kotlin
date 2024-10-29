package com.luotao.learningkotlin.doc.concepts.classesandobjects.properties

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/properties.html#declaring-properties
class _01 {

    @Test
    fun _01() {

        class C01 {
            // 使用 var 声明一个 property, 可读可写,
            var x: Int = 0

            // 使用 val 声明一个 property, 只读,
            val y: Int = 0
        }

        var c01 = C01()

        assertEquals(0, c01.x)

        c01.x = 8
        assertEquals(8, c01.x)

        assertEquals(0, c01.y)
    }
}
