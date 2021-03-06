package com.alibaba.testable.demo.model

abstract class Box {

    var content: String? = null

    abstract fun put(something: String)

    open fun get(): String? {
        return content
    }

}
