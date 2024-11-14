package com.luotao.learningkotlin.doc.concepts.functions.functions

import kotlin.test.Test

// https://kotlinlang.org/docs/functions.html#variable-number-of-arguments-varargs
class _05 {

    @Test
    fun _01() {

        // 使用 vararg 关键字将一个参数标记为可变参数,
        // 最多只能将一个参数标记为 vararg,
        // vararg 参数可以是最后一个参数, 也可以不是最后一个参数,

        fun fn01(x: String, vararg y: Int) {}
        fn01("X", 1, 2, 3)

        fun fn02(x: String, vararg y: Int, z: Boolean) {}
        // 如果 vararg 参数不是最后一个参数, 则在调用时他后面的参数必须指定名称,
        fn02("X", 1, 2, 3, z = false)

        fun fn03(vararg a: Int) {
            // vararg 参数本质上是一个数组,
            a.forEach { println(it) }
        }
    }
}
