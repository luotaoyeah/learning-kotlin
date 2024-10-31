package com.luotao.learningkotlin.doc.concepts.classesandobjects.extensions._01

import org.junit.jupiter.api.Assertions
import kotlin.test.Test

// https://kotlinlang.org/docs/extensions.html#extension-functions
class _01 {

    @Test
    fun _01() {

        // 扩展方法, extension method, 在方法名前面加上 `<被扩展的类型>.`,
        fun String.ext01(): String {
            // 方法中的 this 表示被扩展的类型的实例对象,
            return this.first().uppercase()
        }

        Assertions.assertEquals("F", "foo".ext01())
    }
}
