package com.luotao.learningkotlin.doc.officiallibraries.coroutines.coroutinesbasics

import com.luotao.learningkotlin.util.now
import kotlin.test.Test
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// https://kotlinlang.org/docs/coroutines-basics.html#scope-builder
class _03 {

    @Test
    fun _01() {
        println("${now()} | BEGIN")

        /** [coroutineScope] 函数用于创建一个 [CoroutineScope], 并在其中执行指定的代码, */
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
