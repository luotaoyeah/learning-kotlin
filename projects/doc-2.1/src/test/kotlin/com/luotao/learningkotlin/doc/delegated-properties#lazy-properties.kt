package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/delegated-properties.html#lazy-properties
class `delegated-properties#lazy-properties` {

    @Test
    fun _01() {
        /**
         * [lazy] 是一个 kotlin 内置的 delegate, 它只定义了 getValue 方法, 因此只能由于只读变量, 它的作用是延迟初始化一个变量, 当变量第一次被读时,
         * 才会调用初始化函数, 并且后续的读都不会再执行初始化函数, 即它指挥执行一次,
         */
        val v01: String by lazy {
            println("lazy initializer")
            "01"
        }

        assertEquals("01", v01)
        assertEquals("01", v01)
    }
}
