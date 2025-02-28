package com.luotao.learningkotlin.doc

import kotlin.test.Test
import kotlin.test.assertEquals

// https://kotlinlang.org/docs/properties.html#late-initialized-properties-and-variables
class `properties#late-initialized-properties-and-variables` {
    @Test
    fun _01() {
        /**
         * 如果变量的类型不能为 null, 并且编译器无法检测到该变量被初始化了, 比如下面的变量 [s01] 是在一个函数中初始化的, 这时候编译器就会编译失败,
         * 提示该变量在使用前未初始化, 解决方法是在定义变量时加上 lateinit 关键字, 告诉编译器该变量保证会在使用前被初始化, 这样编译器就不会报错了,
         * 当然如果运行时该变量在使用前确实没初始化, 则会抛出一个异常,
         */
        lateinit var s01: String

        fun fn01() {
            s01 = "A"
        }

        fn01()

        assertEquals("A", s01)
    }
}
