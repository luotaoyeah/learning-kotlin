package com.luotao.learningkotlin.doc

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/delegated-properties.html#observable-properties
class `delegated-properties#providing-a-delegate` {

    class CA : ReadWriteProperty<Any?, String> {
        override fun getValue(thisRef: Any?, property: KProperty<*>): String {
            println("${CA::class.simpleName}.${CA::getValue.name}()")
            return "01"
        }

        override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {}
    }

    // 类似于一个用来创建 delegate 的 factory function,
    class CB {
        operator fun provideDelegate(thisRef: Any?, property: KProperty<*>): CA {
            println("${CB::class.simpleName}.${CB::provideDelegate.name}()")
            return CA()
        }
    }

    @Test
    fun _01() {
        var v01: String by CA()
        assertEquals("01", v01)

        var v02: String by CB()
        assertEquals("01", v02)
    }
}
