package com.base.android.kotlinbasic.E_17_컬렉션

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    list.forEachIndexed { index, value -> println("index : $index, value : $value") }
}