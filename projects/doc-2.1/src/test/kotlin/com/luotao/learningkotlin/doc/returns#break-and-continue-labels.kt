package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/returns.html#break-and-continue-labels
class `returns#break-and-continue-labels` {
    @Test
    fun _01() {
        // kotlin 中所有的表达式都可以定义一个 label, 语法为在表达上前面加上 xxx@,
        laable01@ val s01: String = "A"

        label02@ fun fn01() {}

        label03@ if (true) {}

        label04@ for (i in 1..3) {
            for (j in 1..3) {
                if (i == 2 && j == 2) {
                    // 使用某个 label 的语法为 @xxx,
                    break@label04
                }

                println("$i,$j")
            }
        }
    }
}
