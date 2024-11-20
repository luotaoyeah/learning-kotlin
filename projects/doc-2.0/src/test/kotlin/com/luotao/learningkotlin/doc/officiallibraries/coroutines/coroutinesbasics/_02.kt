package com.luotao.learningkotlin.doc.officiallibraries.coroutines.coroutinesbasics

import com.luotao.learningkotlin.util.now
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutines-basics.html#extract-function-refactoring
class _02 {

    @Test
    fun _01() {
        println("${now()} | BEGIN")

        runBlocking {
            suspend fun doWorld() {
                delay(2000)
                println("${now()} | WORLD")
            }

            launch { doWorld() }

            println("${now()} | HELLO")
        }

        println("${now()} | END")
    }
}
