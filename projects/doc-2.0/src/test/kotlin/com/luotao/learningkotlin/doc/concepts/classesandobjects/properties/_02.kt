package com.luotao.learningkotlin.doc.concepts.classesandobjects.properties

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/properties.html#getters-and-setters
class _02 {

    @Test
    fun _01() {
        class C01 {
            // 有默认的 getter, setter,
            var x: String = "a"

            // 自定义的 getter, setter,
            // 如果可以从 getter 的返回类型推断, 则可以省略 property 的类型,
            var y
                get() = x.uppercase()
                set(value) {
                    x = value.lowercase()
                }
        }

        var c01 = C01()

        assertEquals("a", c01.x)
        assertEquals("A", c01.y)

        c01.y = "B"
        assertEquals("b", c01.x)
        assertEquals("B", c01.y)

        class C02 {
            // val property 是只读的, 不能声明 setter,
            val x
                get() = 8

            // 如果自定义的 getter 和 setter 没有 body, 则相当于没有自定义, 已让使用的是默认的 getter 和 setter,
            // 一般用在需要给 getter 或者 setter 添加 annotation, 或者设置访问限定符,
            var y: Int = 0
                get
                set
        }

        var c02 = C02()
        assertEquals(0, c02.y)

        c02.y = 8
        assertEquals(8, c02.y)
    }
}
