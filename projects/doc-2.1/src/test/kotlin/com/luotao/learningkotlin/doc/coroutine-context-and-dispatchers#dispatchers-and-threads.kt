package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.*
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutine-context-and-dispatchers.html#dispatchers-and-threads
@OptIn(DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
class `coroutine-context-and-dispatchers#dispatchers-and-threads` {
    @Test
    fun _01() {
        runBlocking {
            /**
             * 创建 coroutine 时如果没有指定 context, 则它会继承它所在的 [CoroutineScope] 中的 [CoroutineScope.coroutineContext],
             */
            launch {
                log("A")
            }

            /**
             * [CoroutineDispatcher] 决定了一个 coroutine 要使用什么线程来执行,
             */
            launch(context = Dispatchers.Default) {
                log("Dispatchers.Default")
            }

            launch(context = newSingleThreadContext("newSingleThreadContext")) {
                log("newSingleThreadContext")
            }

            launch(context = Dispatchers.Unconfined) {
                log("Dispatchers.Unconfined")
            }

            launch(context = Dispatchers.IO) {
                log("Dispatchers.IO")
            }
        }
    }
}
