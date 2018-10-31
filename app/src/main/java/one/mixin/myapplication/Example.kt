package one.mixin.myapplication

class Example {

    open class A {
        open fun a() {
        }
    }

    private val handler by lazy {
        object : A() {
            override fun a() {
            }
        }
    }
}