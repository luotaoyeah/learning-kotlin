package com.luotao.learningkotlin.doc.concepts.functions.lambdas

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/lambdas.html#higher-order-functions
class _01 {

    @Test
    fun _01() {
        // kotlin 中的函数是一等公民, 即函数可以当成普通对象传递和赋值, 如下, 函数的参数可以是一个函数类型,
        fun fn01(a: Int, fn: (Int, Int) -> Int): Int {
            return a + fn(a, a)
        }

        // 1. 将一个 lambda 传给函数类型的参数,
        assertEquals(3, fn01(1, { x, y -> x + y }))

        // 2. 将一个匿名函数传给函数类型的参数,
        assertEquals(
            1,
            fn01(
                1,
                // 如下是一个匿名函数,
                fun(x: Int, y: Int): Int {
                    return x - y
                },
            ),
        )

        fun fn02(x: Int, y: Int): Int {
            return x * y
        }

        // 3. 通过函数引用, 将一个已经存在的函数传给函数类型的参数,
        assertEquals(6, fn01(2, ::fn02))

        // 函数的最后一个参数是 lambda 时, 可以把这个 lambda 放到圆括号外面,
        assertEquals(3, fn01(1) { x, y -> x + y })
    }
}
