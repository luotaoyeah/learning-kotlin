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

    class C03 {
        fun fn01(x: Int = 1, y: Int): Int {
            return x + y
        }
    }

    class C04 {
        fun fn01(x: Int = 1, y: () -> Int): Int {
            return x + y()
        }
    }

    @Test
    fun _01() {
        Assertions.assertEquals(2, C02().fn01(1))
    }

    @Test
    fun _02() {
        Assertions.assertEquals(2, C03().fn01(1, 1))

        // 如果有默认值的参数在无默认值的参数前面, 则调用方法时需要用具名参数的形式, 才能让参数默认值生效,
        Assertions.assertEquals(2, C03().fn01(y = 1))
    }

    @Test
    fun _03() {
        Assertions.assertEquals(2, C03().fn01(y = 1))
    }

    @Test
    fun _04() {
        Assertions.assertEquals(2, C04().fn01(1, { 1 }))
        Assertions.assertEquals(2, C04().fn01(y = { 1 }))

        // 当函数的最后一个参数是 lambda 时, 可以把它放到圆括号的外面,
        Assertions.assertEquals(2, C04().fn01(1) { 1 })
        Assertions.assertEquals(2, C04().fn01() { 1 })
        Assertions.assertEquals(2, C04().fn01 { 1 })
    }
}
