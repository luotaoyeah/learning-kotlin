package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/functions.html#variable-number-of-arguments-varargs
class `functions#variable-number-of-arguments-varargs` {

    @Test
    fun _01() {

        fun fn01(vararg a: Int): Int {
            /** vararg 参数 [a] 的类型为 [IntArray] */
            return a.reduce { a, b -> a + b }
        }

        assertEquals(6, fn01(1, 2, 3))

        // 可以使用 *(spread operator) 将一个数组展开后传给 vararg 参数,
        var array01: IntArray = intArrayOf(1, 2, 3)
        assertEquals(6, fn01(*array01))
    }
}
