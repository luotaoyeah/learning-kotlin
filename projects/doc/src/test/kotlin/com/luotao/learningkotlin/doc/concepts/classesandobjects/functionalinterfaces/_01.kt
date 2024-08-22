package com.luotao.learningkotlin.doc.concepts.classesandobjects.functionalinterfaces

import kotlin.test.Test

// https://kotlinlang.org/docs/fun-interfaces.html
class _01 {

    // 如果一个接口中只有一个抽象方法(abstract method), 则在 interface 关键字前面加上 fun 关键字, 此时这个接口叫做 functional
    // interface,
    fun interface I01 {
        fun invoke(i: Int): Boolean

        fun fn01() {}

        fun fn02() {}
    }

    @Test
    fun _01() {

        class C01 {
            fun fn01(x: I01) {}
        }

        var i01: I01 = I01({ it -> true })

        // 把一个 lambda 赋值给 functional interface,
        C01().fn01({ it -> it % 2 == 0 })
    }
}
