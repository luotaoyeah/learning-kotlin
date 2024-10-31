package com.luotao.learningkotlin.doc.concepts.classesandobjects.extensions._02

import kotlin.test.Test

// https://kotlinlang.org/docs/extensions.html#extensions-are-resolved-statically
class _02 {

    @Test
    fun _01() {
        class C01 {
            fun fn01() {
                println("C01.fn01()")
            }
        }

        // 如果扩展方法跟原类中的方法冲突, 则调用该方法时始终调用的是原类中的方法,
        // Extension is shadowed by a member: public final fun fn01(): Unit
        @Suppress("EXTENSION_SHADOWED_BY_MEMBER")
        fun C01.fn01() {
            println("extension.fn01()")
        }

        C01().fn01()
    }
}
