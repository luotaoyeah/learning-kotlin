package com.luotao.learningkotlin.doc.concepts.classesandobjects.objectdeclarationsandexpressions

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/object-declarations.html#data-objects
class _02 {
    // 编译器会自动帮 data object 生成 toString(), equals(), hashCode() 方法,
    data object obj01 {
        val x: Int = 1
    }

    @Test
    fun _01() {
        assertEquals("obj01", obj01.toString())
    }
}
