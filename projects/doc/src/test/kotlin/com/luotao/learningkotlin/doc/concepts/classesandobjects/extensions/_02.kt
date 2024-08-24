package com.luotao.learningkotlin.doc.concepts.classesandobjects.extensions

import kotlin.test.Test

// https://kotlinlang.org/docs/extensions.html#scope-of-extensions
class _02 {

    @Test fun _01() {}
}

fun String.fn01() {
    println("String.fn01()")
}
