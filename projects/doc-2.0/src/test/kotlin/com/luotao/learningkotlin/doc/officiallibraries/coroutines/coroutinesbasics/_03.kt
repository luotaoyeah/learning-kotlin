package com.luotao.learningkotlin.doc.officiallibraries.coroutines.coroutinesbasics

import com.luotao.learningkotlin.util.now
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutines-basics.html#scope-builder
class _03 {

    @Test
    fun _01() {
        println("${now()} | BEGIN")

        /** [coroutineScope] 函数本身是一个 suspend 函数, 用于创建一个 [CoroutineScope], 并在其中执行指定的代码, */
        suspend fun doWorld() {
            coroutineScope {
                launch {
                    delay(2000)
                    println("${now()} | WORLD")
                }

                println("${now()} | HELLO")
            }
        }

        runBlocking { doWorld() }

        println("${now()} | END")
    }
}
