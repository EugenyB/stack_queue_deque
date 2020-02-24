class QueueList<T> {
    private var head: Element<T>? = null
    private var tail: Element<T>? = null
    val isEmpty: Boolean
        get() = head == null

    fun push(value: T) {
        val element = Element(value)
        if (head==null) {
            head = element
        } else {
            tail!!.next = element
        }
        tail = element
    }

    fun poll(): T {
        val current = head!!.value
        head = head!!.next
        return current
    }

    internal inner class Element<T>(var value: T) {
        var next: Element<T>? = null
    }
}