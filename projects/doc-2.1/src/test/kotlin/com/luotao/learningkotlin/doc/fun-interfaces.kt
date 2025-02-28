package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/fun-interfaces.html
class `fun-interfaces` {
    // functional interface 或者 SAM(Single Abstract Method) interface 是一种特殊的 interface,
    // 使用关键字 fun interface 定义, 它有且只能有一个 abstract function,

    fun interface IA {
        fun fn01(): Boolean

        // 可以拥有 non-abstract function,
        fun fn02() {}
    }

    @Test
    fun _01() {
        IA { true }
    }
}
