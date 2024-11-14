package com.luotao.learningkotlin.doc.concepts.functions.functions

import kotlin.test.Test

// https://kotlinlang.org/docs/functions.html#named-arguments
class _02 {

    @Test
    fun _01() {

        fun fn01(a: String, b: Int, c: Boolean, d: Double) {
            println("a: $a, b: $b, c: $c, d: $d")
        }

        // 调用函数的时候, 可以指定部分参数的名称,
        fn01("A", c = false, b = 1, d = 0.01)
    }
}
