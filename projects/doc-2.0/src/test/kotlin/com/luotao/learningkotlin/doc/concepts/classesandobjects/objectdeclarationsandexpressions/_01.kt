package com.luotao.learningkotlin.doc.concepts.classesandobjects.objectdeclarationsandexpressions

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/object-declarations.html#object-declarations-overview
class _01 {

    // object declaration 指的是使用 object 关键字声明一个 class 的同时, 创建一个该 class 的单例对象, 该对象的名称就是该 class 的名称,
    // object declaration 不是一个 expression,
    // object declaration 不能定义在方法里面,
    object O01 {
        fun fn01(): Int = 1

        val x: Int = 1
    }

    open class C01(x: Int) {}

    // object declaration 可以指定父类,
    object obj02 : C01(0) {}

    @Test
    fun _01() {
        assertEquals(1, O01.fn01())
        assertEquals(1, O01.x)
    }
}
