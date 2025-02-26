package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/properties.html#backing-fields
class `properties#backing-fields` {
    @Test
    fun _01() {
        // 在下面这些情况下, kotlin 会自动给 property 生成 backing field,
        //   1. 使用了默认的 getter,
        //   2. 使用了默认的 setter,
        //   3. 在自定义的 getter/setter 中使用关键字 field 访问了 backing field,

        class C01 {
            // 1. 使用了默认的 getter,
            var p01: String = ""
                set(value) {}

            // 2. 使用了默认的 setter,
            var p02: String = ""
                get() = ""

            // 3. 在自定义的 getter 中访问了 field,
            val p03: String = ""
                get() = field
        }
    }
}
