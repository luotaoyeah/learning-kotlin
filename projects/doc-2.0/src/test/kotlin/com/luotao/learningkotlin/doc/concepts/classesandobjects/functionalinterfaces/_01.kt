package com.luotao.learningkotlin.doc.concepts.classesandobjects.functionalinterfaces

import kotlin.test.Test

// https://kotlinlang.org/docs/fun-interfaces.html
class _01 {

    // 如果一个接口中只有一个抽象方法(abstract method), 则在 interface 关键字前面加上 fun 关键字, 此时这个接口叫做 functional
    // interface, 或者叫做 SAM(single abstract method) interface,
    fun interface I01 {
        fun invoke(i: Int): Boolean

        // functional interface 中只能有一个 abstract 方法, 但是可以有任意多个其他的 non-abstract 方法,

        fun fn01() {}

        fun fn02() {}
    }

    class C01 {
        fun fn01(a: I01) {}
    }

    @Test
    fun _01() {
        // 声明一个 anonymous object 并且实现了该 functional interface,
        var i01 =
            object : I01 {
                override fun invoke(i: Int): Boolean {
                    return i % 2 == 0
                }
            }

        C01().fn01(i01)
    }

    // https://kotlinlang.org/docs/fun-interfaces.html#sam-conversions
    @Test
    fun _02() {
        // kotlin 支持 SAM conversion 的特性, 将满足条件的 lambda 转换为对应的 functional interface 实例,
        var i02 = I01({ it -> it % 2 == 0 })
        C01().fn01(i02)
    }

    @Test
    fun _03() {
        // 把一个 lambda 直接赋值给类型为 functional interface 的参数,
        C01().fn01({ it % 2 == 0 })
    }
}
