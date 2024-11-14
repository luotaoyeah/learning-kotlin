package com.luotao.learningkotlin.doc.concepts.functions.functions

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/functions.html#default-arguments
class _01 {

    @Test
    fun _01() {
        open class C01 {
            // 指定了参数 y 的默认值, 则调用时可以不传该参数,
            open fun fn01(x: Int, y: Int = 1): Int {
                return x + y
            }
        }

        class C02 : C01() {
            // overriding method 会继承原方法的参数默认值, 并且它的所有参数都不能指定默认值,
            override fun fn01(x: Int, y: Int): Int {
                return x + y
            }
        }

        assertEquals(2, C02().fn01(1))
    }

    @Test
    fun _02() {
        class C03 {
            // 有默认值的参数可以在无默认值的参数前面,
            fun fn01(x: Int = 1, y: Int): Int {
                return x + y
            }
        }

        assertEquals(2, C03().fn01(1, 1))

        // 如果有默认值的参数在无默认值的参数前面, 则调用方法时需要用具名参数的形式, 才能让参数默认值生效,
        assertEquals(2, C03().fn01(y = 1))
    }

    @Test
    fun _04() {
        class C04 {
            fun fn01(x: Int = 1, y: () -> Int): Int {
                return x + y()
            }
        }

        assertEquals(2, C04().fn01(1, { 1 }))
        assertEquals(2, C04().fn01(y = { 1 }))

        // 当函数的最后一个参数是 lambda 时, 可以把它放到圆括号的外面,
        assertEquals(2, C04().fn01(1) { 1 })
        assertEquals(2, C04().fn01() { 1 })
        assertEquals(2, C04().fn01 { 1 })
    }
}
