package com.luotao.learningkotlin.doc.concepts.classesandobjects.inheritance

import kotlin.test.Test

// https://kotlinlang.org/docs/inheritance.html#overriding-methods
class _02 {

    @Test
    fun _01() {
        // 标注为 open 的类才能被继承,
        open class C01 {
            fun fn01() {}

            // 标注为 open 的方法才能被覆写,
            open fun fn02() {}
        }

        class C02 : C01() {
            // 覆写方法时必须标注为 override,
            override fun fn02() {
                super.fn02()
            }
        }

        class C03 : C01() {
            // 使用 override 标注的覆写方法默认是 open 的, 即可以被它的子类继续覆写, 除非显式地标注为 final,
            final override fun fn02() {
                super.fn02()
            }
        }
    }
}
