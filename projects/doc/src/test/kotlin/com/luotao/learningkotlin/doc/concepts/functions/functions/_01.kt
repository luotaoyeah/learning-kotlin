package com.luotao.learningkotlin.doc.concepts.functions.functions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

// https://kotlinlang.org/docs/functions.html#default-arguments
class _01 {
    open class C01 {
        open fun fn01(x: Int, y: Int = 1): Int {
            return x + y
        }
    }

    class C02 : C01() {
        // override method 会继承原方法的参数默认值, 并且它不能指定参数默认值,
        override fun fn01(x: Int, y: Int): Int {
            return x + y
        }
    }

    @Test
    fun _01() {
        Assertions.assertEquals(2, C02().fn01(1))
    }
}
