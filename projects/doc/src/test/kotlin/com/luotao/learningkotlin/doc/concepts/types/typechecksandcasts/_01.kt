package com.luotao.learningkotlin.doc.concepts.types.typechecksandcasts

import org.junit.jupiter.api.Assertions
import kotlin.test.Test

// https://kotlinlang.org/docs/typecasts.html#is-and-is-operators
class _01 {

    // 使用 is 和 !is 判断对象是否是某个类型,
    @Test
    fun _01() {
        Assertions.assertTrue(1 is Int)
        Assertions.assertTrue(1 !is Long)

        Assertions.assertTrue(1L is Long)
    }
}