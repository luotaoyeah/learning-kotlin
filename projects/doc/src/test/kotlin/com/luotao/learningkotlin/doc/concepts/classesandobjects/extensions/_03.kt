package com.luotao.learningkotlin.doc.concepts.classesandobjects.extensions._03

// 在其他包里面定义的扩展方法, 需要先引入进来才能使用,
import com.luotao.learningkotlin.doc.concepts.classesandobjects.extensions.fn01
import kotlin.test.Test

// https://kotlinlang.org/docs/extensions.html#scope-of-extensions
class _03 {

    @Test
    fun _01() {
        "".fn01()
    }
}
