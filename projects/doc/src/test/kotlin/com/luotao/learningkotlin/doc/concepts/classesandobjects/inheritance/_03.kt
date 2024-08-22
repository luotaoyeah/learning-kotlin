package com.luotao.learningkotlin.doc.concepts.classesandobjects.inheritance

import kotlin.test.Test

// https://kotlinlang.org/docs/inheritance.html#overriding-rules
class _03 {

    open class C01 {
        open fun fn01() {
            println("C01.fn01()")
        }
    }

    interface I01 {
        fun fn01() {
            println("I01.fn01()")
        }
    }

    @Test
    fun _01() {
        // 如果多个父类(class 和 interface)中包含相同方法, 则子类必须覆写这个方法以避免歧义,
        class C02 : C01(), I01 {
            override fun fn01() {
                // 通过 super<父类>.fun() 来区分调用的是哪个父类中的方法,
                super<C01>.fn01()
                super<I01>.fn01()
            }
        }

        C02().fn01()
    }
}