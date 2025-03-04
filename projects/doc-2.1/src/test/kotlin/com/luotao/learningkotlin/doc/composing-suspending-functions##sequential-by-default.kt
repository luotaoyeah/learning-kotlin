package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/composing-suspending-functions.html#sequential-by-default
class `composing-suspending-functions##sequential-by-default` {
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

        /** coroutine 中的 suspend function 默认就是顺序执行的, 即后面的代码要等待前面的 suspend function 执行完之后才会执行, */
        runBlocking {
            log("A")

            fn01()
            fn02()

            log("B")
        }
    }
}
