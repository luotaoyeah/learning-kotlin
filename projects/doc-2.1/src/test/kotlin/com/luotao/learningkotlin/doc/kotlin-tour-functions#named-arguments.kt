package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/kotlin-tour-functions.html#named-arguments
class `kotlin-tour-functions#named-arguments` {
    @Test
    fun _01() {
        fun fn01(x: Int, y: String, z: Boolean) {}

        // named parameter 和 positional parameter 可以混用,
        // named parameter 可以放到任何位置, 只要它不破坏 positional parameter 的顺序,
        // positional parameter 必须放到该参数定义的位置上,
        fn01(1, z = false, y = "Y")
        fn01(x = 1, "Y", z = false)
    }
}
