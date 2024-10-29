package com.luotao.learningkotlin.doc.concepts.classesandobjects.classes

import kotlin.test.Test

// https://kotlinlang.org/docs/classes.html#secondary-constructors
class _03 {

    @Test
    fun _01() {
        class C01 {
            // 在 class body 中定义 secondary constructor, 使用关键字 constructor,
            constructor(x: Int) {}
        }

        // 如果有 primary constructor, 则所有的 secondary constructor 都必须直接或者间接地调用 primary constructor,
        // 这个调用叫做 delegation,
        class C02(x: Int) {
            // 直接地 delegate,
            constructor(x: Int, y: Int) : this(x) {}

            // 间接地 delegate,
            constructor(x: Int, y: Int, z: Int) : this(x, y)
        }

        class C03() {
            init {
                println("init A")
            }

            var p01 = "".also { println("init property") }

            init {
                println("init B")
            }

            constructor(x: Int) : this() {
                // secondary constructor 中的代码会在所有的 initializer block 以及 property initialization
                // 之后执行,
                println("init secondary constructor")
            }
        }
    }

    @Test
    fun _02() {
        // 如果一个类没有显式声明 primary constructor 或者 secondary constructor, 则会默认生成一个无参的 primary
        // constructor,
        class C01

        var c01 = C01()
    }
}
