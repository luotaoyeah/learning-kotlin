package com.luotao.learningkotlin.doc.concepts.classesandobjects.properties

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/properties.html#late-initialized-properties-and-variables
class _04 {

    @Test
    fun _01() {
        class C01 {
            // property 必须在声明时赋值, 或者在 constructor 中赋值, 否则编译报错,
            // 如果该 property 是通过依赖注入等其他方式赋值, 而编译器识别不了这种情况, 可以加上关键字 lateinit 让编译器不报错,

            var a: String = ""
            var b: String
            lateinit var c: String

            constructor() {
                b = ""
            }
        }

        var c01 = C01()
        c01.c = ""
        assertEquals("", c01.c)
    }
}
