package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/delegation.html
class delegation {
    interface IA {
        fun fn01()

        fun fn02()
    }

    class CA : IA {
        override fun fn01() {
            println("${CA::class.simpleName}.${CA::fn01.name}()")
        }

        override fun fn02() {
            println("${CA::class.simpleName}.${CA::fn02.name}()")
        }
    }

    /**
     * 实现某个接口比如下面的 [IA] 时, 可以将对接口的实现委托给另外一个对象 [ca], 这个被委托的对象 [ca] 必须是接口 [IA] 的实现类的对象, 实现委托的语法是使用 by
     * 关键字,
     */
    class CB(ca: CA) : IA by ca {
        // 在使用委托的情况下, 依然可以对部分属性或者方法进行重写, 这样就实现了: 部分属性使用委托, 部分属性不用委托,
        override fun fn02() {
            println("${CB::class.simpleName}.${CB::fn02.name}()")
        }
    }

    @Test
    fun _01() {
        val ca = CA()
        ca.fn01()
        ca.fn02()

        val cb = CB(ca)
        cb.fn01()
        cb.fn02()
    }
}
