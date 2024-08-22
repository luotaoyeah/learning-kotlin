// https://kotlinlang.org/docs/arrays.html#create-arrays

package com.luotao.learningkotlin.doc.concepts.types.basictypes.arrays

fun main() {
    // 使用 Array 构造函数创建数组,

    val arr01 = Array<Int>(3, { i -> 0 })
    val arr02 = Array<Int>(3) { i -> 0 }
    val arr03 = Array<Int>(3) { 0 }

    assert(arr01.contentEquals(arr02))
    assert(arr01.contentEquals(arr03))
}
