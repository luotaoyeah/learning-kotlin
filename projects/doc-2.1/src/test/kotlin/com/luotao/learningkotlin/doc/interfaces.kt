package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/interfaces.html
class interfaces {
    interface IA {
        // interface 中的方法如果没有实现, 则默认就是 abstract 的,
        fun foo()

        // interface 中的方法可以拥有实现,
        fun bar() {
            println("BAR")
        }
    }

    class CA : IA {
        override fun foo() {
            println("FOO")
        }
    }

    @Test
    fun _01() {
        var ca01 = CA()
        ca01.foo()
        ca01.bar()
    }
}
