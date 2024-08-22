// https://kotlinlang.org/docs/numbers.html#explicit-number-conversions

package com.luotao.learningkotlin.doc.concepts.types.basictypes.numbers

fun main() {
    // 可以直接在数字字面量上调用方法,
    var byte01: Byte = 1.toByte()

    // 不支持原始类型,
    // Unresolved reference 'int'.
    // var i: int = 1
}
