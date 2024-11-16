package com.luotao.learningkotlin.doc.concepts.functions.operatoroverloading

import kotlin.test.Test

// https://kotlinlang.org/docs/operator-overloading.html#unary-prefix-operators
class _01 {

    @Test
    fun _01() {
        data class Point(var x: Int, var y: Int) {

            // 运算符 +-*/ 等本质上就是一些函数, 它们都有对应的固定的名称,
            // 当一个函数前面加上 operator 关键字时, 表示它是一个运算符重载函数, 它的名字就不能是随意的, 必须是某个规定好的运算符的函数名,
            // 比如下面的 unaryMinus 表示的就是一元运算符 -
            operator fun unaryMinus(): Point {
                return Point(-x, -y)
            }
        }

        println(Point(10, 20))
        println(-Point(10, 20))
    }
}
