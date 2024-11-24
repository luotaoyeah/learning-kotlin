package com.luotao.learningkotlin.doc.officiallibraries.coroutines.cancellationandtimeouts

import com.luotao.learningkotlin.util.log
import kotlin.test.Test
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

// https://kotlinlang.org/docs/flow.html#representing-multiple-values
class _01 {
    @Test
    fun _01() {
        var list01: List<Int> = listOf(1, 2, 3)

        list01.forEach { println(it) }
    }

    // https://kotlinlang.org/docs/flow.html#sequences
    @Test
    fun _02() {
        fun simple(): Sequence<Int> = sequence {
            log("START")

            // sequence 可以同步地返回多个数据, 但是缺点是会阻塞线程,
            for (i in 1..3) {
                Thread.sleep(1000)
                yield(i)
            }

            log("END")
        }

        simple().forEach { log(it.toString()) }
    }

    // https://kotlinlang.org/docs/flow.html#suspending-functions
    @Test
    fun _03() {
        // suspend function 只能一次返回单个数据,
        suspend fun simple(): List<Int> {
            log("START")

            delay(1000)

            var list01 = listOf<Int>(1, 2, 3)

            log("END")

            return list01
        }

        runBlocking { simple().forEach { log(it.toString()) } }
    }

    // https://kotlinlang.org/docs/flow.html#flows
    @Test
    fun _04() {

        // flow 可以异步地返回多个数据,
        fun simple(): Flow<Int> = flow {
            for (i in 1..3) {
                delay(1000)

                // 调用 FlowCollector.emit() 方法吐出数据,
                emit(i)
            }
        }

        runBlocking {
            log("START")

            // 调用 Flow.collect() 方法介绍数据,
            simple().collect { log(it.toString()) }

            log("END")
        }
    }
}
