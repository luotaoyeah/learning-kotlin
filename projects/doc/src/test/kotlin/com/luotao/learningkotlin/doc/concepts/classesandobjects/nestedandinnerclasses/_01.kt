package com.luotao.learningkotlin.doc.concepts.classesandobjects.nestedandinnerclasses._01

import org.junit.jupiter.api.Test

// https://kotlinlang.org/docs/nested-classes.html
class _01 {
    @Test
    fun _01() {
        // nested class 通过类名访问,
        var c04 = C03.C04()

        // inner class 通过实例对象访问,
        var c05 = C03().C05()
    }
}

// class 和 interface 可以相互嵌套,

class C01 {
    interface I01
}

interface I02 {
    class C02
}

class C03 {
    class C04

    // nested class 前面加上 inner 关键字, 就叫做 inner class,
    inner class C05
}

interface I03 {
    interface I04
}
