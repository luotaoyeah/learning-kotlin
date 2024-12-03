package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/kotlin-tour-hello-world.html#string-templates
class `kotlin-tour-hello-world#string-templates` {
    @Test
    fun _01() {
        val i01 = 1

        // 在 string template 中, 如果是简单的变量, 可以省略花括号,
        assertEquals("i01 = 1", "i01 = $i01")
        assertEquals("i01 = 1", "i01 = ${i01}")
        assertEquals("i01 + 1 = 2", "i01 + 1 = ${i01 + 1}")
    }
}
