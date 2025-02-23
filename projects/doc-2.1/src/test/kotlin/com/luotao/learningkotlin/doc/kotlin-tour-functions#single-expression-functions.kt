package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/kotlin-tour-functions.html#single-expression-functions
class `kotlin-tour-functions#single-expression-functions` {
    @Test
    fun _01() {
        // 如果函数只包含一条语句, 则可以使用下面的方式来定义,
        fun fn01() {
            println("A")
        }

        fun fn02() = println("A")
    }
}
