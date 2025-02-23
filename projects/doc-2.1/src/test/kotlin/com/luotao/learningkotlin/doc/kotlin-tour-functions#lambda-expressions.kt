package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/kotlin-tour-functions.html#lambda-expressions
class `kotlin-tour-functions#lambda-expressions` {
    @Test
    fun _01() {
        // 如下定义一个 lambda 表达式,
        //   1. 使用花括号包裹,
        //   2. 参数列表和函数体使用 -> 分隔,
        //   3. 参数列表没有使用圆括号包裹,
        val lambda01 = { x: Int, y: Int -> x + y }

        // lambda 的函数体中可以包含多条语句,
        // 这多条语句不能使用花括号包裹起来, 如果包裹起来则它们又成了一个新的 lambda 表达式了,
        val lambda02 = { x: Int, y: Int ->
            println("")
            x + y
        }

        // 如果参数列表为空, 则可以省略参数列表和 ->,
        val lambda03 = { println("") }
    }

    @Test
    fun _02() {
        // 可以显式声明 lambda 的类型,
        var lambda01: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

        // 可以在定义 lambda 的同时调用它,
        val result = { x: Int, y: Int -> x + y }(1, 2)
        assertEquals(result, 3)
    }

    @Test
    fun _03() {
        fun fn01(x: Int = 1, fn: () -> Unit) {}

        // 如果在调用函数时, 最后一个参数是 lambda, 则可以把 lambda 放到圆括号的外面,
        fn01(1, { println("") })
        fn01(1) { println("") }

        // 如果在调用函数时, 最后一个参数是 lambda, 并且没有其他参数, 则可以省略圆括号,
        fn01() { println("") }
        fn01 { println("") }
    }
}
