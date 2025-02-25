package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/control-flow.html#for-loops
class `control-flow#for-loops` {
    @Test
    fun _01() {
        val list01 = listOf<String>("A", "B", "C")

        for (item in list01) {
            println(item)
        }

        /** 使用扩展方法 [withIndex] 获取集合的索引, 在需要遍历集合并且获取每次遍历的索引时有用, */
        for ((index, value) in list01.withIndex()) {
            println("$index: $value")
        }
    }
}
