// https://kotlinlang.org/docs/basic-syntax.html#string-templates

package com.luotao.learningkotlin.doc.basicsyntax._05


fun main() {
    val x = 9
    val y = 9
    var str01 = "x: $x, y: ${y}, x + y = ${x + y}"
    assert(str01 == "x: 9, y: 9, x + y = 18")
}