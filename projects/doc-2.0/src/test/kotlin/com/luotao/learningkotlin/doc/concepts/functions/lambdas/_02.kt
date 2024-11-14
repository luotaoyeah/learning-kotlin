package com.luotao.learningkotlin.doc.concepts.functions.lambdas

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/lambdas.html#instantiating-a-function-type
class _02 {

    @Test
    fun _01() {
        // 一个函数类型实际上对应了一个接口, 比如类型 (Int) -> Int 对应的接口为 kotlin.jvm.functions.Function0,
        // 因此一个函数类型可以被一个类实现, 并覆写 invoke 方法,
        class F01 : (Int) -> Int {
            override fun invoke(p1: Int): Int {
                return p1 * 2
            }
        }

        fun fn01(x: Int, fn: (Int) -> Int): Int {
            return x + fn(x)
        }

        assertEquals(9, fn01(3, { it * 2 }))

        // 类 F01 的实例对象就可以被当成对应类型的函数来使用,
        assertEquals(9, fn01(3, F01()))

        // 声明一个匿名的 object 并实现函数类型接口,
        assertEquals(
            12,
            fn01(
                3,
                object : (Int) -> Int {
                    override fun invoke(p1: Int): Int {
                        return p1 * 3
                    }
                },
            ),
        )

        // 调用函数的两种方式,
        //   1. 直接通过圆括号调用,
        //   2. 或者调用它的 invoke() 方法,
        assertEquals(4, F01()(2))
        assertEquals(4, F01().invoke(2))

        // 如下, 通过 invoke() 的方式调用一个 lambda,
        assertEquals(6, ({ x: Int -> x * 2 }).invoke(3))
    }
}
