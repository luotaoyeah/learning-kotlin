package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutines-basics.html#scope-builder-and-concurrency
class `coroutines-basics#scope-builder-and-concurrency` {
    @Test
    fun _01() {
        suspend fun fn01() {
            coroutineScope {
                /** [launch] 开启一个新的 coroutine */
                launch {
                    delay(2000)
                    log("C")
                }

                /** [launch] 开启一个新的 coroutine */
                launch {
                    delay(1000)
                    log("D")
                }

                /** 上面两个 [launch] 开启的两个 coroutine 是并行执行的, */
                log("B")
            }
        }

        /** [runBlocking] 开启一个新的 coroutine */
        runBlocking {
            log("A")
            fn01()
            log("E")
        }
    }
}
