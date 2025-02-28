package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

// https://kotlinlang.org/docs/enum-classes.html
class `enum-classes` {

    enum class EA {
        A,
        B,
        C,
    }

    // 可以定义 constructor, 以及 property,
    enum class EB(val a: Int) {
        A(1),
        B(2),
        C(3),
    }

    enum class EC {
        A,
        B,
        C;

        // 可以定义 property, 它们跟枚举实例之间使用逗号分隔,
        val a: Int = ordinal + 1
    }

    enum class ED {
        // A 是该枚举类的匿名子类的一个实例对象,
        A {
            val a: Int = ordinal + 1
        },

        // B 是该枚举类的一个实例对象,
        B,
    }

    @Test
    fun _01() {
        assertEquals(1, EC.A.a)

        assertTrue(ED.A is ED)
    }
}
