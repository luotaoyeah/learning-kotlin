package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/inheritance.html
class inheritance {
    @Test
    fun _01() {
        open class C01 {
            constructor(a: Int) {}

            constructor(a: Int, b: Int) {}
        }

        // 如果子类有 primary constructor, 则在继承父类时必须调用父类的某个 constructor,

        /** 如下 [C02] 有隐式的 primary constructor, */
        class C02 : C01(0, 0) {}

        /** 如下 [C03] 有显式的 primary constructor, */
        class C03() : C01(0, 0) {
            // 有 primary constructor 则 secondary constructor 必须委托调用 primary constructor,
            // 则 secondary constructor 就间接地调用了父类的 constructor,
            constructor(a: Int, b: Int) : this() {}
        }

        /** 如下 [C04] 没有 primary constructor, 则不需要调用父类的 constructor, */
        class C04 : C01 {
            /** 由于 [C04] 没有 primary constructor, 则它的 secondary constructor 必须委托调用父类的 constructor, */
            constructor(a: Int, b: Int) : super(0) {}
        }
    }
}
