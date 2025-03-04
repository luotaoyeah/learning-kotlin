package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.*
import kotlin.test.Test

// https://kotlinlang.org/docs/composing-suspending-functions.html#lazily-started-async
class `composing-suspending-functions#lazily-started-async` {
    @Test
    fun _01() {
        suspend fun fnC() {
            delay(1000)
            log("C")
        }

        suspend fun fnD() {
            delay(1000)
            log("D")
        }

        runBlocking {
            log("A")

            /**
             * 如果 [launch] 的 start 参数传 [CoroutineStart.LAZY], 则这个 coroutine 创建之后不会自己启动, 需要手动调用
             * [Job.join] 方法或者 [Job.start] 方法来启动它, 或者调用 [Deferred.await] 方法来启动它,
             *
             * 注意 [Job.start] 是一个普通的函数, 它不是 suspend function, [Job.join] 和 [Deferred.await] 是
             * suspend function,
             */
            val jobC = launch(start = CoroutineStart.LAZY) { fnC() }
            val jobD = launch(start = CoroutineStart.LAZY) { fnD() }

            log("B")

            delay(1000)
            log("START C")
            jobC.start()

            delay(1000)
            log("START D")
            jobD.start()
        }
    }
}
