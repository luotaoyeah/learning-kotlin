package com.luotao.learningkotlin.doc.concepts.functions.lambdas

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/lambdas.html#function-literals-with-receiver
class _04 {

    @Test
    fun _01() {
        // 当一个 lambda 的类型中声明了 receiver 时, 则在它的代码块中可以通过 this 访问这个 receiver 对象,
        val fn01: Int.(Int) -> Int = { other -> this.plus(other) }

        // 也可以省略 this.
        val fn02: Int.(Int) -> Int = { other -> plus(other) }

        // 调用这种有 receiver 的 lambda 时, 可以使用 receiver.<函数名> 的形式调用,
        assertEquals(3, 1.fn01(2))

        // 也可以使用如下这种形式, 即将 receiver 作为第一个参数传入函数,
        assertEquals(3, fn01(1, 2))
    }

    @Test
    fun _02() {
        // 上面那种有 receiver 的 lambda 就有点类似于扩展方法,
        fun Int.fn01(other: Int): Int {
            return plus(other)
        }

        // 调用这种有 receiver 的 lambda 时, 可以使用 receiver.<函数名> 的形式调用,
        assertEquals(3, 1.fn01(2))

        // 扩展方法不能用下面这种方式调用,
        // assertEquals(3, fn01(1, 2))
    }

    @Test
    fun _03() {
        // 匿名函数也可以声明 receiver,
        var fn01 =
            fun Int.(other: Int): Int {
                return this.plus(other)
            }
        assertEquals(3, 1.fn01(2))
    }
}
