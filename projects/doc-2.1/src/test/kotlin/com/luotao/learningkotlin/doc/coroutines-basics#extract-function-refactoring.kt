package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutines-basics.html#extract-function-refactoring
class `coroutines-basics#extract-function-refactoring` {
    @Test
    fun _01() {

        // 因为 delay() 是一个 suspend function, 因此调用它的 fn01() 也必须声明为 suspend function,
        suspend fun fn01() {
            log("C")
            delay(1000)
            log("D")
        }

        runBlocking {
            log("A")

            launch { fn01() }

            log("B")
        }
    }
}
