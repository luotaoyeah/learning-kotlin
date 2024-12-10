package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/delegation.html
class delegation {
    interface IA {
        fun fn01()
    }

    class CA : IA {
        override fun fn01() {
            println("${CA::class.simpleName}.${CA::fn01.name}()")
        }
    }

    /**
     * 实现某个接口比如下面的 [IA] 时, 可以将对接口的实现委托给另外一个对象 [ca], 这个被委托的对象 [ca] 必须是接口 [IA] 的实现类的对象,
     */
    class CB(ca: CA) : IA by ca {}

    @Test
    fun _01() {
        val ca = CA()
        ca.fn01()

        val cb = CB(ca)
        cb.fn01()
    }
}
