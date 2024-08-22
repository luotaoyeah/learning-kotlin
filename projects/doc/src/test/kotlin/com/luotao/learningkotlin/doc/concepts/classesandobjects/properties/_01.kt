package com.luotao.learningkotlin.doc.concepts.classesandobjects.properties

import kotlin.test.Test
import org.junit.jupiter.api.Assertions

// https://kotlinlang.org/docs/properties.html#getters-and-setters
class _01 {

    @Test
    fun _01() {
        class C01 {
            // 有默认的 getter, setter,
            var x: String = "x"

            // 自定义的 getter, setter,
            var y
                get() = x.uppercase()
                set(value) {
                    x = value.lowercase()
                }
        }

        var c01 = C01()

        Assertions.assertEquals("x", c01.x)
        Assertions.assertEquals("X", c01.y)

        c01.y = "Y"
        Assertions.assertEquals("y", c01.x)
        Assertions.assertEquals("Y", c01.y)
    }
}
