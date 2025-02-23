package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/kotlin-tour-classes.html#properties
class `kotlin-tour-classes#properties` {
    @Test
    fun _01() {
        // 在定义 class 的时候, primary constructor 的参数列表中, 如果一个参数前面加了 val 或者 var, 则这个参数会成为这个类的 property,
        // 如下, x 是 property, y 不是 property,
        class C01(val x: Int, y: String)

        var c01 = C01(1, "")
        assertEquals(1, c01.x)
    }

    @Test
    fun _02() {
        class C01(val x: String) {
            // 在 class 中, 显式定义一个 property,
            val y: String = "Y"
        }

        var c01 = C01("X")
        assertEquals(c01.x, "X")
        assertEquals(c01.y, "Y")
    }
}
