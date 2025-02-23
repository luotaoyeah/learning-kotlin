package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/kotlin-tour-functions.html#functions-without-return
class `kotlin-tour-functions#functions-without-return` {
    @Test
    fun _01() {
        // 如果没有显式声明返回类型, 则默认为 Unit,
        fun fn01() {}

        // 1. 如果返回类型为 Unit, 可以显式地 return Unit,
        fun fn02() {
            return Unit
        }

        // 2. 如果返回类型为 Unit, 可以显式地 return,
        fun fn03() {
            return
        }

        // 3. 如果返回类型为 Unit, 可以省略 return 语句,
        fun fn04() {}
    }
}
