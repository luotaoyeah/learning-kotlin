package com.luotao.learningkotlin.doc.officiallibraries.coroutines.cancellationandtimeouts

import com.luotao.learningkotlin.util.log
import kotlin.test.Test

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

            // sequence 的缺点是会阻塞线程,
            for (i in 1..3) {
                Thread.sleep(1000)
                yield(i)
            }

            log("END")
        }

        simple().forEach { log(it.toString()) }
    }
}