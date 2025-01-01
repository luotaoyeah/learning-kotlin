package com.luotao.learningkotlin.doc

import com.luotao.learningkotlin.util.log
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

// https://kotlinlang.org/docs/coroutine-context-and-dispatchers.html#naming-coroutines-for-debugging
class `coroutine-context-and-dispatchers#naming-coroutines-for-debugging` {
    @Test
    fun _01() {
        runBlocking {
            /**
             * 使用 [CoroutineName] 自定义 coroutine 的名称, 默认的名称为 `coroutine`,
             * [CoroutineName] 是 [kotlin.coroutines.CoroutineContext] 中的一种 element,
             */
            launch(context = CoroutineName("SOME-CO")) {
                log("A")
            }

            launch {
                log("B")
            }
        }
    }
}
