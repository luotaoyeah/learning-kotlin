package com.luotao.learningkotlin.doc

import kotlin.reflect.KProperty
import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/delegated-properties.html
class `delegated-properties` {

    class CA {
        private var a: String = ""

        /** 如果被委托的是本地变量, 而不是类的属性, 则 [thisRef] 为 null, */
        operator fun getValue(thisRef: Any?, p: KProperty<*>): String {
            println("${CA::class.simpleName}.${CA::getValue.name}(): $a")
            return a
        }

        operator fun setValue(thisRef: Any?, p: KProperty<*>, value: String) {
            println("${CA::class.simpleName}.${CA::setValue.name}(): $value")
            a = value
        }
    }

    @Test
    fun _01() {
        /**
         * 使用 by 子句, 对变量或者类的属性进行委托, 委托对象需要像上面的 [CA] 一样提供两个方法, 如果是只读属性只需要提供 operator setValue() 方法,
         */
        var v01: String by CA()

        v01 = "01"
        assertEquals("01", v01)
    }
}
