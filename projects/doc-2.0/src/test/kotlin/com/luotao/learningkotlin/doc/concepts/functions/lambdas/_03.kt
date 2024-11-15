package com.luotao.learningkotlin.doc.concepts.functions.lambdas

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/lambdas.html#lambda-expression-syntax
class _03 {

    @Test
    fun _01() {
        // 当 lambda 的返回类型不是 Unit 时, 它里面的最后一个表达式就是它的返回值,
        assertEquals(
            3,
            ({
                if (false) {
                    2
                } else {
                    3
                }
            })(),
        )
    }
}
