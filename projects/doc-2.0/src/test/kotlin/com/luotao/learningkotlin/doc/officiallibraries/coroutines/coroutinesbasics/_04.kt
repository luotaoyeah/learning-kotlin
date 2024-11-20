package com.luotao.learningkotlin.doc.officiallibraries.coroutines.coroutinesbasics

import com.luotao.learningkotlin.util.now
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutines-basics.html#scope-builder-and-concurrency
class _04 {

    @Test
    fun _01() {

        /** [coroutineScope] 函数里面可以使用 [launch] 启动多个 coroutine, */
        suspend fun doWorld() {
            coroutineScope {
                launch {
                    delay(2000)
                    println("${now()} | CCC")
                }

                launch {
                    delay(1000)
                    println("${now()} | BBB")
                }

                println("${now()} | AAA")
            }
        }

        runBlocking { doWorld() }
    }
}
