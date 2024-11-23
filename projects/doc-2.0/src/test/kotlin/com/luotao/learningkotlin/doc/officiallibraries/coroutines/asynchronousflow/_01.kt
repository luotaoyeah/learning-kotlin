package com.luotao.learningkotlin.doc.officiallibraries.coroutines.asynchronousflow

import com.luotao.learningkotlin.util.log
import kotlin.test.Test
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// https://kotlinlang.org/docs/cancellation-and-timeouts.html
class _01 {
    @Test
    fun _01() {
        runBlocking {
            var job = launch {
                try {
                    repeat(100) {
                        log("$it")
                        delay(1000)
                    }
                } catch (e: CancellationException) {
                    log("CancellationException")
                }
            }
            log("${job.isActive}")

            delay(2000)
            job.cancel()
            job.join()
            log("CANCEL")
        }
    }
}
