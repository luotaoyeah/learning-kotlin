package com.luotao.learningkotlin.doc.concepts.classesandobjects.objectexpressionsanddeclarations

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

// https://kotlinlang.org/docs/object-declarations.html#object-declarations-overview
class _02 {

    // object declaration 指的是在使用 object 关键字声明对象时, object 后面指定了对象的名称,
    // object declaration 不是一个 expression,
    // object declaration 不能定义在方法里面,
    object obj01 {
        fun fn01(): Int = 1

        val x: Int = 1
    }

    // object declaration 可以指定父类,
    object obj02 : Any() {}

    @Test
    fun _01() {
        Assertions.assertEquals(1, obj01.fn01())
        Assertions.assertEquals(1, obj01.x)
    }
}
