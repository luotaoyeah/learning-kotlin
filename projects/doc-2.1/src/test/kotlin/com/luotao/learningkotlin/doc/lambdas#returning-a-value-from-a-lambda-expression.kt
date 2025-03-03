package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/lambdas.html#returning-a-value-from-a-lambda-expression
class `lambdas#returning-a-value-from-a-lambda-expression` {

    @Test
    fun _01() {
        val list01 = listOf<Int>(1, 2, 3, 4, 5)

        list01.filter {
            println("A:$it")

            // 如果没有显式地 return, 则 lambda 中最后一个表达式会作为返回值,
            it % 2 == 0
        }

        println("Z")
    }

    @Test
    fun _02() {
        val list01 = listOf<Int>(1, 2, 3, 4, 5)

        list01.filter label01@{
            println("A:$it")

            // 如果使用 return 显式返回, 则 return 需要加上 lambda 的 label,
            return@label01 it % 2 == 0
        }

        println("Z")
    }

    @Test
    fun _03() {
        val list01 = listOf<Int>(1, 2, 3, 4, 5)

        list01.filter {
            println("A:$it")

            // lambda 有一个默认的 label, 就是它所属的调用函数的函数名,
            return@filter it % 2 == 0
        }

        println("Z")
    }
}
