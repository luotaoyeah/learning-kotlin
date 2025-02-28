package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/interfaces.html#properties-in-interfaces
class `interfaces#properties-in-interfaces` {
    // interface 中的 property 必须满足:
    //   1. 要么是 abstract property,
    //   2. 要么全部用自定义的 getter/setter, 即没有 backing field, 相当于是一个计算属性, 因为 interface 本身不能存储状态数据,

    interface IA {
        var p01: String

        val p02: String
            get() = "P02"
    }

    class CA : IA {
        override var p01: String = "P01"
    }

    @Test
    fun _01() {
        var ca01 = CA()
        assertEquals("P01", ca01.p01)
        assertEquals("P02", ca01.p02)
    }
}
