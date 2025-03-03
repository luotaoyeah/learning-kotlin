package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertFalse

// https://kotlinlang.org/docs/lambdas.html#invoking-a-function-type-instance
class `lambdas#invoking-a-function-type-instance` {

    @Test
    fun _01() {
        val fn01: String.(Int) -> Boolean = { false }

        // function type 的变量, 可以像普通函数一样直接调用, 也可以调用它的 invoke() 方法,
        assertFalse { fn01.invoke("", 0) }

        // 有 receiver 的函数类型, 在调用时, 可以把 receiver 作为第一个参数传入, 也可以使用 receiver.fun() 的形式,
        assertFalse { fn01("", 0) }
        assertFalse { "".fn01(0) }
    }
}
