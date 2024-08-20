// https://kotlinlang.org/docs/strings.html

package com.luotao.learningkotlin.doc.concepts.types.basictypes.strings

fun main() {
    // 遍历字符串中的字符,
    for (c in "ABC") {
        println(c)
    }

    // 三个双引号包裹的多行字符串,
    val str01 = """
        A
        B
        C
    """
    println(str01)
    println(str01.trimIndent())
    println(str01.trimMargin())
}