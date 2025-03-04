package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutines-basics.html#your-first-coroutine
class `coroutines-basics#your-first-coroutine` {
    @Test
    fun _01() {
        log("A")

        /**
         * [runBlocking] 是一个 coroutine builder, 用来创建一个 coroutine, 并且会阻塞当前线程, 通常用来在非 coroutine 环境下开启
         * coroutine 环境, 比如 main 方法中, 或者单元测试中,
         */
        runBlocking {
            log("C")

            /** [launch] 也是一个 coroutine builder, 用来创建一个 coroutine, 但是不会阻塞当前线程, */
            launch {
                delay(1000)
                log("D")
            }

            log("E")
        }

        log("B")
    }

    // https://kotlinlang.org/docs/coroutines-basics.html#structured-concurrency
    @Test
    fun _02() {
        log("A")

        runBlocking {
            log("C")
            delay(1000)
            log("D")

            launch {
                log("E")
                delay(1000)
                log("F")
            }

            log("G")
        }

        log("B")
    }
}
