package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/exceptions.html#the-nothing-type
class `exceptions#the-nothing-type` {
    @Test
    fun _01() {
        /** [Nothing] 是一个特殊的类型, 它是所有类型的子类, 即它可以赋值给任何类型, */

        /** 1. 始终抛出异常的函数, 返回类型是 [Nothing], */
        fun fn01(): Nothing {
            throw RuntimeException()
        }

        /** 2. 无限循环的函数, 返回类型是 [Nothing], */
        fun fn02(): Nothing {
            while (true) {}
        }
    }
}
