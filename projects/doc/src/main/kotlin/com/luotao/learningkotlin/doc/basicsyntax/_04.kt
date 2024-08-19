// https://kotlinlang.org/docs/basic-syntax.html#creating-classes-and-instances

package com.luotao.learningkotlin.doc.basicsyntax._04


fun main() {
    assert(C01() is C01)

    val c03 = C03(1, 2)
    assert(c03 is C03)
}


// 声明一个最简单的类,
class C01

// 类默认是 final 的, 不能被继承,
open class C02

class C03(x: Int, y: Int) {
}