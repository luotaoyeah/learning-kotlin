package com.luotao.learningkotlin.doc.concepts.classesandobjects.inheritance

import kotlin.test.Test

// https://kotlinlang.org/docs/inheritance.html
class _01 {

    @Test
    fun _01() {
        // 类默认是 final class, 不能被继承, 声明为 open class 才能被继承,
        open class C01(x: Int) {
            constructor() : this(0) {}

            constructor(x: Int, y: Int) : this(x) {}

            constructor(x: Int, y: Int, z: Int) : this(x, y) {}
        }

        class C02 : C01 {
            // 子类的 constructor 中必须调用父类的 constructor, 如果没有显式调用, 表示默认调用的是父类的无参的 constructor,
            constructor() {}

            // 通过 super() 显式地调用父类的 constructor,
            constructor(x: Int) : super(x) {}
        }

        // 如下, C03 只有一个 primary constructor, 因此必须在 primary constructor 后面调用父类的 constructor,
        class C03 : C01() {}
    }
}
