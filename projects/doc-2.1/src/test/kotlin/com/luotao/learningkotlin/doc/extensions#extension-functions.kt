package com.luotao.learningkotlin.doc

import kotlin.test.Test

// https://kotlinlang.org/docs/extensions.html#extension-functions
class `extensions#extension-functions` {

    class CA {
        fun fn01() {
            println("01")
        }
    }

    // 扩展方法前面的类型, 即被扩展的类型, 称为 receiver type,
    fun CA.fn02() {
        // 在扩展方法中, 通过 this 访问 receiver type 的实例对象, 称为 receiver object,
        this.fn01()
        println("02")
    }

    // 如果扩展方法跟成员方法签名相同, 则成员方法生效,
    fun CA.fn01() {
        println("扩展 01")
    }

    @Test
    fun _01() {
        CA().fn01()
        CA().fn02()
    }
}
