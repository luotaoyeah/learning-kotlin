package com.luotao.learningkotlin.doc.concepts.classesandobjects.properties

import kotlin.test.Test

// https://kotlinlang.org/docs/properties.html#backing-fields
class _03 {

    @Test
    fun _01() {
        class C01 {
            // kotlin 中不能直接声明字段, 但是可以在 getter, setter 中通过 field 标识访问该 property 内部的字段,
            var x = 0
                get() = field
                set(value) {
                    field = value
                }

            // 什么时候会存在 backing field ?
            //     1. 有默认的 getter 或/和 setter
            //     2. 在自定义的 getter / setter 中访问了 field 标识,

            // 因此如果只有自定义的 getter/setter, 并且在 getter/setter 中没有访问 field,
            // 则该 property 就没有 backing field,
        }
    }
}
