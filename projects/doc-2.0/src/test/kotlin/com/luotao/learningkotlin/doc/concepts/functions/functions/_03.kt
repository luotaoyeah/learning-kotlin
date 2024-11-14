package com.luotao.learningkotlin.doc.concepts.functions.functions

import kotlin.test.Test

// https://kotlinlang.org/docs/functions.html#unit-returning-functions
class _03 {

    @Test
    fun _01() {

        // 当函数的返回类型为 Unit 时, 可以省略 return 语句,
        fun fn01(): Unit {}

        // 当函数的返回类型为 Unit 时, 可以直接 return 后面不加东西,
        fun fn02(): Unit {
            return
        }

        // 当函数的返回类型为 Unit 时, 可以直接 return Unit,
        fun fn03(): Unit {
            return Unit
        }

        // 当函数的返回类型为 Unit 时, 可以不用声明返回类型,
        fun fn04() {}
    }
}
