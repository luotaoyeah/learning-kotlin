package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/extensions.html#extension-properties
class `extensions#extension-properties` {

    class CA {}

    // 扩展属性不能拥有 backing field, 因此,
    //   1. 不能使用默认的 getter / setter,
    //   2. 不能在自定义的 getter setter 中通过 field 关键字访问 backing field,
    //   3. 不能赋初始值, 因为初始值会用到 backing field,
    val CA.p01: String
        get() = "01"

    @Test
    fun _01() {
        assertEquals("01", CA().p01)
    }
}
