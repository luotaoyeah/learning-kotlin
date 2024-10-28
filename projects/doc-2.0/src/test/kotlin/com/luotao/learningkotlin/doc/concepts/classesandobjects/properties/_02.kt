package com.luotao.learningkotlin.doc.concepts.classesandobjects.properties

import kotlin.test.Test

// https://kotlinlang.org/docs/properties.html#backing-fields
class _02 {

    @Test
    fun _01() {
        class C01 {
            // 不能直接声明字段, 但是可以在 getter, setter 中通过 field 访问该属性内部的字段,
            var x = 0
                get() = field
                set(value) {
                    field = value
                }
        }
    }
}
