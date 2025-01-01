package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.*
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutines-basics.html#scope-builder
class `coroutines-basics#scope-builder` {
    @Test
    fun _01() {

        fun CoroutineScope.fn01() {
            log("A")

            launch {
                log("C")
                delay(1000)
                log("D")
            }

            log("B")
        }

        runBlocking {
            fn01()
        }
    }

    @Test
    fun _02() {

        suspend fun fn01() {
            log("A")

            /**
             * [coroutineScope] 本身是一个 suspend function,
             * 它的函数参数有一个 [CoroutineScope] 类型的 receiver, 因此该函数参数里面的代码可以使用这个 [CoroutineScope],
             */
            coroutineScope {
                /**
                 * 调用 [launch] 刚好需要一个 [CoroutineScope] 类型的 receiver, 于是用上了 [coroutineScope] 提供的 [CoroutineScope],
                 */
                launch {
                    log("C")
                    delay(1000)
                    log("D")
                }
            }

            log("B")
        }

        runBlocking {
            fn01()
        }
    }
}
