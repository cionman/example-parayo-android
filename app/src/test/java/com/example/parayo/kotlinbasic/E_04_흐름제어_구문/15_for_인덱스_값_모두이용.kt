package com.base.android.kotlinbasic.E_04_흐름제어_구문

fun main(args: Array<String>) {
    val list = listOf<String>("hello", "world", "!")
    for((index, value) in list.withIndex()){
        println("인덱스는 $index 값은 $value")
    }
}