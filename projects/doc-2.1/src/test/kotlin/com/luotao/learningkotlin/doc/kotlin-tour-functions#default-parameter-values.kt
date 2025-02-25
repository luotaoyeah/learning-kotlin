package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/kotlin-tour-functions.html#default-parameter-values
class `kotlin-tour-functions#default-parameter-values` {
    @Test
    fun _01() {
        // 使用 = 定义参数的默认值, 「有默认值的参数」可以放到「无默认值的参数」前面（这是因为 kotlin 支持 named parameter）,
        fun fn01(x: Int = 1, y: String = "Y", z: Boolean) {}

        // 调用时, 有默认值的参数可以不传,
        fn01(1, z = false)
    }
}
