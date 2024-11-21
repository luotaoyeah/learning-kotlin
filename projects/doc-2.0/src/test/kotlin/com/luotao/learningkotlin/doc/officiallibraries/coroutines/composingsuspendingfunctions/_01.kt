package com.luotao.learningkotlin.doc.officiallibraries.coroutines.composingsuspendingfunctions

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/composing-suspending-functions.html
class _01 {
    @Test
    fun _01() {

        suspend fun fn01() {
            delay(1000)
            log("fn01")
        }

        suspend fun fn02() {
            delay(1000)
            log("fn02")
        }

        runBlocking {
            // 多个 suspend function 默认就是按顺序执行的, 即后面的函数需要等待前面的函数执行完毕并且返回之后, 才会执行,
            // 如下, 类似于 javascript 中的 `await fn01(); await fn02();`
            fn01()
            fn02()
        }
    }
}
