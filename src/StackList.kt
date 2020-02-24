class StackList<T> {
    private var top: Element<T>? = null
    val isEmpty: Boolean
        get() = top == null

    fun push(value: T) {
        val element = Element(value)
        element.next = top
        top = element
    }

    fun pop(): T {
        val current = top!!.value
        top = top!!.next
        return current
    }

    internal inner class Element<T>(var value: T) {
        var next: Element<T>? = null

    }
}