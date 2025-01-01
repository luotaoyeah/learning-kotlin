package com.luotao.learningkotlin.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun now(): String {
    return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
}

fun log(message: String) {
    println("${now()} | ${Thread.currentThread().threadGroup.name} | ${Thread.currentThread().name} | $message")
}
