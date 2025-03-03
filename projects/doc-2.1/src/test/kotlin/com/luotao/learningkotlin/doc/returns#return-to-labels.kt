package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/returns.html#return-to-labels
class `returns#return-to-labels` {
    @Test
    fun _01() {
        fun fn01() {
            println("BEGIN")

            listOf<String>("A", "B", "C").forEach { it: String ->
                if (it == "B") {
                    // forEach() 是一个 inline 函数, 因此作为它的参数当前 lambda 也会被 inline,
                    // 因此这里的 return 实际上作用的是他们所处的函数 fn01(), 因此下面的 END 不会被打印,
                    return
                }

                println(it)
            }

            println("END")
        }

        fn01()

        fun fn02() {
            println("BEGIN")

            // 给 lambda 定义一个 label, 就可以通过 return@label 的形式来结束该 lambda, 而不是像上面一样结束它所处的函数,
            listOf<String>("A", "B", "C").forEach label01@{ it: String ->
                if (it == "B") {
                    return@label01
                }

                println(it)
            }

            println("END")
        }

        fn02()
    }

    @Test
    fun _02() {
        fun fn01() {
            println("BEGIN")

            // lambda 有一个默认的 label, 就是它所属的调用函数的函数名,
            listOf<String>("A", "B", "C").forEach { it: String ->
                if (it == "B") {
                    return@forEach
                }
                println(it)
            }

            println("END")
        }

        fn01()
    }
}
