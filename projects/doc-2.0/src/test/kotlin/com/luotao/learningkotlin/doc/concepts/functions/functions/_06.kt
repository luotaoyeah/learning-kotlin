package com.luotao.learningkotlin.doc.concepts.functions.functions

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/functions.html#infix-notation
class _06 {

    // 当一个方法满足下列条件时, 可以将它标记为 infix function:
    //   1. 是一个类的方法, 或者扩展方法(extension function)
    //   2. 只有一个参数
    //   3. 参数不是 vararg, 参数没有默认值,

    infix fun Int.myPlus(that: Int): Int {
        return this + that
    }

    @Test
    fun _01() {
        assertEquals(2, 1.myPlus(1))

        // 可以使用下面这种形式来调用一个 infix function, 即省略 . 和 ()
        assertEquals(2, 1 myPlus 1)
    }

    @Test
    fun _02() {
        // 调用 infix function 时, 必须指定左右两个成员, 不能省略任何一个,
    }
}
