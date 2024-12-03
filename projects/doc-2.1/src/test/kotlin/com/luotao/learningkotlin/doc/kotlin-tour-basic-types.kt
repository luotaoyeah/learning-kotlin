package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/kotlin-tour-basic-types.html
class `kotlin-tour-basic-types` {
    @Test
    fun _01() {
        // 声明变量的同时进行初始化, 由于可以推断类型, 因此可以省略类型,
        val i01 = 1

        // 先声明变量, 再初始化, 此时必须声明类型,
        var i02: Int
        i02 = 1
    }
}
