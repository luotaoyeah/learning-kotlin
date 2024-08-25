package com.luotao.learningkotlin.doc.concepts.classesandobjects.objectexpressionsanddeclarations

import org.junit.jupiter.api.Test

// https://kotlinlang.org/docs/object-declarations.html
class _01 {
    @Test
    fun _01() {
        // 使用 object 关键字定义一个 anonymous object, 由于没有指定它的类型, 因此它默认是继承自 Any 类型,
        val obj01 =
            object {
                var name: String = "LUOTAO"
                var age: Int = 18

                override fun toString(): String {
                    return "name: $name; age: $age"
                }
            }

        println(obj01.name)
        println(obj01.age)
        println(obj01)
    }
}
