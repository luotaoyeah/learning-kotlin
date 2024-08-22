package com.luotao.learningkotlin.doc.concepts.classesandobjects.classes

import kotlin.test.Test

// https://kotlinlang.org/docs/classes.html
class _01 {

    // class 包含三部分, class name, class header, class body, 其中 class header 和 class body 是可选的,
    @Test
    fun _01() {
        // 只有 class name
        class C01

        // 拥有 class name, class body,
        class C02 {}

        // 拥有 class name, class header,
        class C03()

        // 拥有 class name, class header, class body,
        class C04() {}
    }
}
