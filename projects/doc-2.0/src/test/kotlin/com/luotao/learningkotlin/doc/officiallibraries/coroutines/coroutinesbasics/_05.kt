package com.luotao.learningkotlin.doc.officiallibraries.coroutines.coroutinesbasics

import com.luotao.learningkotlin.util.now
import kotlin.test.Test
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// https://kotlinlang.org/docs/coroutines-basics.html#an-explicit-job
class _05 {

    @Test
    fun _01() {

        runBlocking {
            // launch 函数返回一个 Job 对象,
            var job = launch {
                delay(1000)
                println("${now()} | CCC")
            }

            println("${now()} | AAA")
            job.join()
            println("${now()} | BBB")
        }
    }
}
