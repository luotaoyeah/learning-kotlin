package com.luotao.learningkotlin.doc.concepts.classesandobjects.extensions

import kotlin.test.Test
import org.junit.jupiter.api.Assertions

// https://kotlinlang.org/docs/extensions.html#extension-functions
class _01 {

    @Test
    fun _01() {
        Assertions.assertEquals("F", "foo".ext01())
    }
}

// 扩展方法, extension method,
fun String.ext01(): String {
    // 方法中的 this 表示被扩展的类型的实例对象,
    return this.first().uppercase()
}
