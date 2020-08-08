package com.base.android.kotlinbasic.E_16_고차함수


fun main(args: Array<String>) {
    var user = User()
    user.run {
        name = "kim"
        sayHello()
    }

    with(user){
        name = "choi"
        sayHello()
    }

}




