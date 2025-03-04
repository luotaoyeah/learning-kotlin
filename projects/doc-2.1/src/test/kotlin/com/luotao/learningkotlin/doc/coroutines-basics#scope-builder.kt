package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlin.test.Test
import kotlinx.coroutines.*

// https://kotlinlang.org/docs/coroutines-basics.html#scope-builder
class `coroutines-basics#scope-builder` {
    @Test
    fun _01() {

        fun CoroutineScope.fn01() {
            log("A")

            /**
             * [launch] 需要一个 [CoroutineScope] 类型的 receiver, 因此它的调用函数需要提供这个 [CoroutineScope], 这里
             * [fn01] 采用的方式不是直接提供, 而是 [fn01] 也声明一个 [CoroutineScope] 类型的 receiver, 然后继承给 [launch],
             */
            launch {
                log("C")
                delay(1000)
                log("D")
            }

            log("B")
        }

        runBlocking { fn01() }
    }

    @Test
    fun _02() {

        suspend fun fn01() {
            log("A")

            /** [coroutineScope] 本身是一个 suspend function, */
            coroutineScope {
                /**
                 * [launch] 需要一个 [CoroutineScope] 类型的 receiver, 因此它的调用函数需要提供这个 [CoroutineScope],
                 * [coroutineScope] 函数刚好给它的函数参数提供了 [CoroutineScope],
                 */
                launch {
                    log("C")
                    delay(1000)
                    log("D")
                }
            }

            log("B")
        }

        runBlocking { fn01() }
    }
}
