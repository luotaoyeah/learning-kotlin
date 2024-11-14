package com.luotao.learningkotlin.doc.concepts.functions.functions

import kotlin.test.Test

// https://kotlinlang.org/docs/functions.html#single-expression-functions
class _04 {

    @Test
    fun _01() {

        fun fn01(): Int {
            return 1 + 1
        }

        // 当函数体中只有一条语句时, 可以使用下面的简写形式,
        // 此时可以不用声明返回类型, 因为可以推断返回类型,
        fun fn02() = 1 + 1

        // 注意, 可以是一条任意的语句, 不需要是表达式,
        fun fn03() = print("HELLO")

        // 当函数体有大括号包裹时, 如果返回类型不是 Unit, 则必须声明返回类型, 因为如果不声明返回类型时默认的返回类型为 Unit,
        fun fn04(): Int {
            return 1 + 1
        }
    }
}
