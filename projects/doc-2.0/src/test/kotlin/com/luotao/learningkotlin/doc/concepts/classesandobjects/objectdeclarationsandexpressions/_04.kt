package com.luotao.learningkotlin.doc.concepts.classesandobjects.objectdeclarationsandexpressions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

// https://kotlinlang.org/docs/object-declarations.html#companion-objects
class _04 {

    // 在 class 里面定义的 object declaration, 如果前面加上 companion 关键字, 则它叫做 companion object,
    class C01 {
        companion object obj01 {
            val x: Int = 1
        }
    }

    class C02 {
        companion object {
            val x: Int = 1
        }
    }

    @Test
    fun _01() {
        // 可以直接通过类名访问 companion object 中的成员,
        Assertions.assertEquals(1, C01.x)
        Assertions.assertEquals(1, C01.obj01.x)

        // companion object 如果没有指定名称, 则默认名称为 Companion,
        Assertions.assertEquals(1, C02.Companion.x)
    }
}
