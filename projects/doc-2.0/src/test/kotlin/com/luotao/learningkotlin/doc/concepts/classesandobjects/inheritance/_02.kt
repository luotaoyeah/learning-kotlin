package com.luotao.learningkotlin.doc.concepts.classesandobjects.inheritance

import kotlin.test.Test

// https://kotlinlang.org/docs/inheritance.html#overriding-methods
class _02 {

    @Test
    fun _01() {
        // 类默认是 final 的, 即不能被继承, 除非显式地用关键字 open 标注,
        open class C01 {
            // 方法默认也是 final 的, 即不能被覆写, 除非显式地用关键字 open 标注,
            fun fn01() {}

            // 标注为 open 的方法才能被覆写,
            open fun fn02() {}
        }

        class C02 : C01() {
            // 覆写方法时必须显式地用关键字 override 标注,
            override fun fn02() {
                super.fn02()
            }
        }

        open class C03 : C01() {
            // 使用 override 标注的覆写方法默认也是 open 的, 即可以被它的子类继续覆写, 除非显式地标注为 final,
            final override fun fn02() {
                super.fn02()
            }
        }

        // 如果一个类是 final 的, 则给它的成员标注为 open 没有效果,
        class C04 : C03() {
            open fun fn04() {}
        }
    }
}
