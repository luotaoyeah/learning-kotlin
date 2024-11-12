package com.luotao.learningkotlin.doc.concepts.classesandobjects.objectdeclarationsandexpressions

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class _04 {
    // https://kotlinlang.org/docs/object-declarations.html#create-anonymous-objects-from-scratch
    @Test
    fun _01() {
        // 使用 object 关键字定义一个 anonymous object, 由于没有指定它的类型, 因此它默认是继承自 Any 类型,
        val obj01 =
            object {
                var name: String = "LUOTAO"
                var age: Int = 18

                override fun toString(): String {
                    return "name: $name; age: $age"
                }
            }

        assertEquals("LUOTAO", obj01.name)
        assertEquals(18, obj01.age)
    }

    // https://kotlinlang.org/docs/object-declarations.html#inherit-anonymous-objects-from-supertypes
    @Test
    fun _02() {
        open class C01 {}

        // 显式指定 anonymous object 的父类,
        val obj01 = object : C01() {}

        assertTrue(obj01 is C01)
    }

    // https://kotlinlang.org/docs/object-declarations.html#using-anonymous-objects-as-return-and-value-types
    @Test
    fun _03() {

        // object expression 作为 local variable 的初始值,
        val obj01 =
            object {
                val x = "X"
            }
        assertEquals("X", obj01.x)

        class C01 {
            // object expression 作为方法的返回值,
            fun fn01() =
                object {
                    val x = "X"
                }
        }
        assertEquals("X", C01().fn01().x)
    }
}
