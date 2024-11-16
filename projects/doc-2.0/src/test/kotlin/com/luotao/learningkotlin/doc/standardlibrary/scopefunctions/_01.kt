package com.luotao.learningkotlin.doc.standardlibrary.scopefunctions

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/scope-functions.html
class _01 {
    @Test
    fun _01() {
        // kotlin 提供了 5 个 scope 函数,

        data class C01(val name: String, val age: Int)

        // let, 通过 it 访问对象, 返回新值,
        assertEquals(
            9,
            C01("LUOTAO", 18).let {
                println(it)
                9
            },
        )

        // run, 通过 this 访问对象, 返回新值,
        assertEquals(
            9,
            C01("LUOTAO", 18).run {
                println(this)
                9
            },
        )

        // run, 可以没有 receiver, 相当于直接执行一段代码, 然后返回新值,
        assertEquals(9, run { 9 })

        // with, 没有 receiver, 接收对象作为参数, 返回新值,
        assertEquals(
            9,
            with(C01("LUOTAO", 18)) {
                println(this)
                9
            },
        )

        // apply, 通过 this 访问对象, 返回 this,
        assertEquals(
            18,
            C01("LUOTAO", 18)
                .apply {
                    println(this)
                    9
                }
                .age,
        )

        // also, 通过 it 访问对象, 返回 this,
        assertEquals(
            18,
            C01("LUOTAO", 18)
                .also {
                    // also 里面通过 it 访问对象, 此时 also 里面的 this 并不等于 it,
                    println(it)
                    println(this)
                    9
                }
                .age,
        )
    }
}
