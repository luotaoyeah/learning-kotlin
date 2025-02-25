package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/classes.html#constructors
class `classes#constructors` {
    @Test
    fun _01() {
        class C01 {}

        // 如果一个 class 的 body 是空的, 则可以省略花括号,
        class C02
        class C03(a: Int)
    }

    @Test
    fun _02() {

        // 如果一个 class 没有显式定义 constructor, 则会默认创建一个无参的 primary constructor,
        class C01
        var c01 = C01()

        // primary constructor 前面如果没有注解或者访问修饰符, 则关键字 constructor 可以省略,
        class C02 constructor()
        class C03()
        class C04 public constructor()
    }

    @Test
    fun _03() {
        // 由于 primary constructor 没有 body, 因此 init{} 代码块就相当于它的 body, 多个 init 代码块按顺序执行,
        class C01 {
            init {
                println("A")
            }

            init {
                println("B")
            }
        }

        var c01 = C01()
    }

    @Test
    fun _04() {
        // primary constructor 的参数前面如果加了 val/var, 则该参数会成为该类的 property,
        class C01(a: Int, val b: Int) {
            // property 的赋值语句中可以访问 primary constructor 的参数,
            val c: Int = a

            init {
                // init 代码块中可以访问 primary constructor 的参数,
                println("init: $b")
            }

            override fun toString(): String {
                return "c: $c, b: $b"
            }
        }

        println(C01(1, 2))
    }
}
