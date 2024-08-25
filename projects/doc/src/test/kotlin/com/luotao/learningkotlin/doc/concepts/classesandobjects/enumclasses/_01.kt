package com.luotao.learningkotlin.doc.concepts.classesandobjects.enumclasses

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

// https://kotlinlang.org/docs/enum-classes.html#working-with-enum-constants
class _01 {
    @Test
    fun _01() {
        for (entry in E01.entries) {
            println(entry.ordinal)
            println(entry.name)
        }

        Assertions.assertEquals(E01.B, E01.valueOf("B"))
    }
}

enum class E01 {
    A,
    B,
    C,
}
