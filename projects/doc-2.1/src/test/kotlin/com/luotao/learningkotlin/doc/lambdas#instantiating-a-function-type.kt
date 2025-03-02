package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/lambdas.html#instantiating-a-function-type
class `lambdas#instantiating-a-function-type` {

    @Test
    fun _01() {
        // 函数类型 (A,B)->C 和 A.(B)->C 是等价的,
        val fn01: String.(Int) -> Boolean = { true }
        val fn02: (String, Int) -> Boolean = fn01

        fun fn03(fn: (String, Int) -> Boolean): Boolean {
            return fn("", 0)
        }

        fn03(fn01)
    }
}
