package com.luotao.learningkotlin.doc.concepts.classesandobjects.classes

import org.junit.jupiter.api.Assertions
import kotlin.test.Test

// https://kotlinlang.org/docs/classes.html#constructors
class _02 {

    @Test
    fun _01() {
        // class 可以有一个 primary constructor, 可以有一个或者多个 secondary constructor,

        // primary constructor 是定义在 class header 中的,
        class C01 constructor(x: Int) {}


        // 如果 primary constructor 前面没有注解或者修饰符, 则可以省略 constructor 关键字,
        class C02(x: Int) {}

        // primary constructor 是定义在 class header 中的, 那么它如何包含其他语句 ? 答案是放到 initializer block 中,
        class C03(x: Int) {
            init {
                println("init A")
            }


            val y: String = "Y".also { println(it) }


            init {
                // 在 initializer block 中使用 primary constructor 的参数,
                println("init B, x: $x")
            }
        }

        var c03 = C03(0)


        // primary constructor 的参数前面如果加了 var 或者 val, 则这些参数会成为类的 property,
        class C04(var x: Int, val y: String)

        val c04 = C04(9, "9")
        Assertions.assertEquals(9, c04.x)
        Assertions.assertEquals("9", c04.y)

    }
}