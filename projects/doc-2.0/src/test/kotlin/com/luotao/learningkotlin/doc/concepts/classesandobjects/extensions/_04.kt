package com.luotao.learningkotlin.doc.concepts.classesandobjects.extensions._04

// 在其他包里面定义的扩展方法, 需要先引入进来才能使用,
import com.luotao.learningkotlin.doc.concepts.classesandobjects.extensions._03.fn01
import kotlin.test.Test

// https://kotlinlang.org/docs/extensions.html#scope-of-extensions
class _04 {

    @Test
    fun _01() {
        "".fn01()
    }
}
