package com.luotao.learningkotlin.doc.officiallibraries.coroutines.cancellationandtimeouts

import com.luotao.learningkotlin.util.log
import kotlin.test.Test
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

// https://kotlinlang.org/docs/flow.html#flows-are-cold
class _02 {
    @Test
    fun _01() {
        fun fn01(): Flow<Int> = flow {
            log("START flow builder")

            for (i in 1..3) {
                delay(1000)
                emit(i)
            }

            log("END flow builder")
        }

        var flow01: Flow<Int> = fn01()

        log("CALL flow builder")

        /** 只有调用 [Flow.collect] 方法时, 才会执行 flow builder 里面的代码, */
        runBlocking { flow01.collect { log(it.toString()) } }
    }

    @Test
    fun _02() {
        // 直接声明一个类型为 Flow 的变量,
        val flow01 = flow {
            log("START flow builder")

            for (i in 1..3) {
                delay(1000)
                emit(i)
            }

            log("END flow builder")
        }

        log("CALL flow builder")

        runBlocking {
            // 可以多次调用 collect() 方法, 每次都能拿到吐出的异步数据, 因此这是一个 cold flow,
            flow01.collect { log(it.toString()) }
            flow01.collect { log(it.toString()) }
            flow01.collect { log(it.toString()) }
        }
    }
}
