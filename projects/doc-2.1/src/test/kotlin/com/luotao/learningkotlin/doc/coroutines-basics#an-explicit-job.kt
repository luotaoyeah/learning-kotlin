package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutines-basics.html#an-explicit-job
class `coroutines-basics#an-explicit-job` {
    @Test
    fun _01() {
        runBlocking {
            log("A")

            /** [launch] 返回一个 [kotlinx.coroutines.Job] 对象, */
            val job = launch {
                log("C")
                delay(1000)
                log("D")
            }

            log("B")

            /**
             * [kotlinx.coroutines.Job.join] 方法是一个 suspend function, 它会等待这个 [kotlinx.coroutines.Job]
             * 完成, 然后再执行后面的代码,
             */
            job.join()
            log("E")
        }
    }
}
