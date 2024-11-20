package com.luotao.learningkotlin.doc.officiallibraries.coroutines.coroutinesbasics

import com.luotao.learningkotlin.util.now
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutines-basics.html#your-first-coroutine
class _01 {
    @Test
    fun _01() {
        runBlocking {
            println("${now()} | HELLO")
            delay(2000)
            println("${now()} | WORLD")
        }
    }

    @Test
    fun _02() {
        println("${now()} | BEGIN")

        // 开启一个新的 coroutine, 并且会阻塞当前线程,
        runBlocking {
            // 开启一个新的 coroutine, 并且不会阻塞当前线程,
            launch {
                delay(2000)
                println("${now()} | WORLD")
            }

            println("${now()} | HELLO")
        }

        println("${now()} | END")
    }
}
