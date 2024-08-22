package com.luotao.learningkotlin.doc.concepts.types.typechecksandcasts

import kotlin.test.Test
import org.junit.jupiter.api.Assertions

// https://kotlinlang.org/docs/typecasts.html#unsafe-cast-operator
class _02 {

    @Test
    fun _01() {
        // 使用 as 强制转换类型, 转换失败会抛异常,
        Assertions.assertThrowsExactly(ClassCastException::class.java) {
            var str01 = 0 as String
        }

        // 使用 as? 强制转换类型, 转换失败会返回 null,
        Assertions.assertNull(0 as? String)
    }
}
