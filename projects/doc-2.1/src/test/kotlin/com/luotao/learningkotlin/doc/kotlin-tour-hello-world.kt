package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/kotlin-tour-hello-world.html
class _00 {
    @Test
    fun _01() {
        // 用 val 声明只读变量, 只能赋值一次,
        val v01: Int
        v01 = 1
        assertEquals(1, v01)

        // 用 var 声明普通变量, 可以多次赋值,
        var v02 = 0
        v02 = 1
        v02 = 2
        assertEquals(2, v02)
    }

    /** 可以在程序的最顶层声明变量, 比如下面的 [v03] */
    @Test
    fun _02() {
        assertEquals(3, v03)
    }
}

var v03 = 3
