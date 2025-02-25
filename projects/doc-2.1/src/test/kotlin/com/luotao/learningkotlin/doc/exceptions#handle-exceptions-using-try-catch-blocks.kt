package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/exceptions.html#handle-exceptions-using-try-catch-blocks
class `exceptions#handle-exceptions-using-try-catch-blocks` {
    @Test
    fun _01() {
        // try...catch 可以作为表达式,
        val i01: Int =
            try {
                if (true) {
                    throw Exception("ERROR")
                }

                1
            } catch (e: Exception) {
                -1
            }

        assertEquals(-1, i01)
    }
}
