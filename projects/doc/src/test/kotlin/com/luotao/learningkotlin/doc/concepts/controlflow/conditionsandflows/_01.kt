package com.luotao.learningkotlin.doc.concepts.controlflow.conditionsandflows

import kotlin.test.Test


// https://kotlinlang.org/docs/control-flow.html#when-expression
class _01 {

    // when 类似于 java 中的 switch,
    @Test
    fun _01() {
        val i = 0

        // when 后面可以有一个条件, 称之为 subject,
        when (i) {
            0 -> println(0)
            1 -> println(1)
            else -> println(-1)
        }

        // when 后面可以没有条件, 此时每一个分支的条件都是一个 boolean 类型的表达式,
        when {
            i == 0 -> println(0)
            i == 1 -> println(1)

            // else 类似于 switch 的 default,
            else -> println(-1)
        }
    }
}