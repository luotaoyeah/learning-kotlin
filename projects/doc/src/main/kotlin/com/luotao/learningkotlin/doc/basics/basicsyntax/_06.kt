// https://kotlinlang.org/docs/basic-syntax.html#conditional-expressions

package com.luotao.learningkotlin.doc.basicsyntax._06

fun main() {
    assert(fun01(1, 9) == 9)
    assert(fun01(8, 2) == 8)
}

// if 语句可以当成表达式使用,
fun fun01(x: Int, y: Int) = if (x > y) x else y
