package com.luotao.learningkotlin.doc.concepts.classesandobjects.extensions

import kotlin.test.Test
import org.junit.jupiter.api.Assertions

// https://kotlinlang.org/docs/extensions.html#extension-functions
class _01 {

    @Test
    fun _01() {
        Assertions.assertEquals("F", "foo".ext01())
    }

    @Test
    fun _02() {
        C01().fn01()
    }
}

// 扩展方法, extension method,
fun String.ext01(): String {
    // 方法中的 this 表示被扩展的类型的实例对象,
    return this.first().uppercase()
}

class C01 {
    fun fn01() {
        println("C01.fn01()")
    }
}

// 如果扩展方法跟原类中的方法冲突, 则调用该方法时始终调用的是原类中的方法,
// Extension is shadowed by a member: public final fun fn01(): Unit
@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
fun C01.fn01() {
    println("extension.fn01()")
}
