package com.luotao.learningkotlin.doc.concepts.classesandobjects.delegatedproperties

import kotlin.reflect.KProperty
import kotlin.test.Test
import kotlin.test.assertEquals

class _01 {

    // https://kotlinlang.org/docs/delegated-properties.html
    @Test
    fun _01() {
        class C01 {
            var b: String = ""

            /** [thisRef] 表示该 property 前面的点前面的对象, [p] 表示该 property 自身, */
            operator fun getValue(thisRef: Any?, p: KProperty<*>): String {
                println("D01 | getValue() | $b")
                return b
            }

            operator fun setValue(thisRef: Any?, p: KProperty<*>, value: String) {
                println("D01 | setValue() | $value")
                b = value + value
            }
        }

        class C02 {
            /**
             * <p>property 的类型后面加上 by expression, 其中的 expression 就称为 delegate, delegate 中必须定义一个
             * operator getValue() 方法, 对应于 property 的 get()</p>
             *
             * <p>如果 property 是可写的, 则 delegate 中还必须定义一个 operator setValue() 方法,, 对应于 property 的
             * set()</p>
             */
            var a: String by C01()
        }

        var c01 = C02()

        c01.a = "A"
        assertEquals("AA", c01.a)

        c01.a = "B"
        assertEquals("BB", c01.a)
    }

    // https://kotlinlang.org/docs/delegated-properties.html#delegating-to-another-property
    @Test
    fun _02() {
        class C01 {
            var a: String = ""
                get() {
                    println("${C01::class.simpleName} | ${C01::a.name} | get()")
                    return field
                }
                set(value) {
                    println("${C01::class.simpleName} | ${C01::a.name} | set()")
                    field = value
                }

            // 将一个 property 委托给另一个 property,
            var b: String by C01::a
        }

        var c01 = C01()

        c01.b = "B"
        assertEquals("B", c01.b)
    }
}
