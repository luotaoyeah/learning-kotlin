// https://kotlinlang.org/docs/basic-syntax.html#functions

package com.luotao.learningkotlin.doc.basicsyntax._02

fun main() {
    assert(fun01() == Unit)
    assert(fun02() == Unit)
    assert(fun03() == Unit)
    assert(fun04(1, 2) == 3)
}

// region
// ----------------------------------------------------------------------------------------------------

// 如果方法没有声明返回值, 则返回类型默认为 Unit, 也可以将返回类型显式地声明为 Unit,
fun fun01() {
    println("fun01")
}

fun fun02(): Unit {
    println("fun02")
}

// ----------------------------------------------------------------------------------------------------
// endregion

// region
// ----------------------------------------------------------------------------------------------------

// 如果方法体只有一条语句, 则可以简写为下面的形式,
fun fun03() = println("fun03")

fun fun04(x: Int, y: Int) = x + y

// ----------------------------------------------------------------------------------------------------
// endregion
