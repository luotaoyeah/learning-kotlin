package com.luotao.learningkotlin.doc.concepts.classesandobjects.dataclasses

import org.junit.jupiter.api.Test

// https://kotlinlang.org/docs/data-classes.html
class _01 {

    data class C01(var x: Int) {}

    @Test
    fun _01() {
        val c01 = C01(1)
        println(c01)
    }
}
