package com.luotao.learningkotlin.doc.officiallibraries.coroutines.composingsuspendingfunctions

import com.luotao.learningkotlin.util.log
import kotlin.test.Test
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

// https://kotlinlang.org/docs/composing-suspending-functions.html
class _01 {
    suspend fun fn01() {
        delay(1000)
        log("fn01")
    }

    suspend fun fn02() {
        delay(1000)
        log("fn02")
    }

    @Test
    fun _01() {
        runBlocking {
            log("BEGIN")

            // 多个 suspend function 默认就是按顺序执行的, 即后面的函数需要等待前面的函数执行完毕并且返回之后, 才会执行,
            // 如下, 类似于 js 中的 `await fn01(); await fn02();`
            fn01()
            fn02()

            log("END")
        }
    }

    // https://kotlinlang.org/docs/composing-suspending-functions.html#concurrent-using-async
    @Test
    fun _02() {
        runBlocking {
            log("BEGIN")

            // async 跟 launch 类似, 也是创建一个新的 coroutine, 区别在于返回的是 Deferred 对象,
            var deferred01 = async { fn01() }
            var deferred02 = async { fn02() }

            // 调用 Deferred.await() 方法, 就类似于 js 中的 await 关键字, 用来等待并且获取结果,
            deferred01.await()
            deferred02.await()

            log("END")
        }
    }

    // https://kotlinlang.org/docs/composing-suspending-functions.html#lazily-started-async
    @Test
    fun _03() {
        runBlocking {
            log("BEGIN")

            // 如果 async 方法参数传入 LAZY, 表示这个 coroutine 创建之后不会马上启动,
            // 而是要等到手动调用 Job.start() 或者 Deferred.await() 方法时才会启动,
            var deferred01 = async(start = CoroutineStart.LAZY) { fn01() }
            var deferred02 = async(start = CoroutineStart.LAZY) { fn02() }

            delay(1000)

            log("start fn01")
            deferred01.start()

            delay(1000)

            log("start fn02")
            deferred02.start()

            log("END")
        }
    }
}
