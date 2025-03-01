package com.luotao.learningkotlin.doc

import kotlin.properties.Delegates
import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/delegated-properties.html#observable-properties
class `delegated-properties#observable-properties` {

    @Test
    fun _01() {
        /** [Delegates.observable] 方法, 是 kotlin 内置的一个 delegate, 作用是监听变量值的变化, */
        var v01: String by
            Delegates.observable("DEFAULT") { property, oldValue, newValue ->
                println("$oldValue -> $newValue")
            }

        assertEquals("DEFAULT", v01)

        v01 = "A"
        v01 = "B"
        v01 = "C"
    }
}
