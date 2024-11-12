package com.luotao.learningkotlin.doc.concepts.classesandobjects.objectdeclarationsandexpressions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

// https://kotlinlang.org/docs/object-declarations.html#data-objects
class _02 {
    // 编译器会自动帮 data object 生成 toString(), equals(), hashCode() 方法,
    data object obj01 {
        val x: Int = 1
    }

    @Test
    fun _01() {
        Assertions.assertEquals("obj01", obj01.toString())
    }
}
