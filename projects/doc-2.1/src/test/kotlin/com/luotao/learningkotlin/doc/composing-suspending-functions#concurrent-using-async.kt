package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.*
import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/composing-suspending-functions.html#concurrent-using-async
class `composing-suspending-functions#concurrent-using-async` {
    @Test
    fun _01() {
        suspend fun fn01() {
            delay(1000)
            log("C")
        }

        suspend fun fn02() {
            delay(2000)
            log("D")
        }

        runBlocking {
            log("A")

            // 将两个 suspend function 分别用 launch 包起来, 则新开启的两个 coroutine 会并行执行,
            val job01 = launch { fn01() }
            val job02 = launch { fn02() }

            log("B")
        }
    }

    @Test
    fun _02() {
        suspend fun fn01() {
            delay(1000)
            log("C")
        }

        suspend fun fn02() {
            delay(1000)
            log("D")
        }

        suspend fun fn03(): Int {
            delay(1000)
            log("E")
            return 9
        }

        runBlocking {
            log("A")

            /**
             * [async] 跟 [launch] 一样, 也是一个 coroutine builder, 区别在于它返回的是一个 [Deferred] 对象, 可以从
             * [Deferred] 获取返回的数据,
             */
            val deferred01 = async { fn01() }
            val deferred02 = async { fn02() }
            val deferred03 = async { fn03() }

            /** 调用 [Deferred.await] 方法可以获取该 suspend function 返回的数据, 就类似于 js 中的 await Promise, */
            val result: Int = deferred03.await()

            assertEquals(9, result)

            log("B")
        }
    }
}
