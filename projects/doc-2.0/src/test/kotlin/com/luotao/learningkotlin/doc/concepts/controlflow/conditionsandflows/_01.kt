package com.luotao.learningkotlin.doc.concepts.controlflow.conditionsandflows

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/control-flow.html#when-expressions-and-statements
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

        // when 后面可以没有 subject, 此时每一个分支的条件都是一个 boolean 类型的表达式,
        when {
            i == 0 -> println(0)
            i == 1 -> println(1)

            // else 类似于 switch 的 default,
            else -> println(-1)
        }
    }

    @Test
    fun _02() {
        var b = true

        // when 可以作为语句, 也可以作为表达式,
        var i =
            when (b) {
                // 每个分支后面可以是代码块, 也可以是单条语句,
                // 如果是代码块, 则代码块中的最后一个表达式的值, 就是该分支的值,
                true -> {
                    1
                }
                false -> 0
            }

        assertEquals(1, i)
    }

    @Test
    fun _03() {
        var b = false

        when (b) {
            // 分支的条件部分可以是多个逗号分隔的条件, 当满足其中任意一个条件时, 都会匹配,
            true,
            false -> println("BOOLEAN")
            else -> println("NULL")
        }
    }

    @Test
    fun _04() {
        var b = false

        // subject 可以是一个变量声明赋值语句,
        when (val b02 = b) {
            false -> println(b02)
            else -> println()
        }
    }
}
