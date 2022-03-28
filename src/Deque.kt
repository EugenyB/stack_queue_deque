class Deque<T> {
    private var head: Element<T>? = null
    private var tail: Element<T>? = null

    val isEmpty: Boolean
        get() = head == null

    fun addFirst(value: T) {
        val element = Element(value)
        if (head == null) {
            tail = element
        } else {
            element.next = head
            head!!.prev = element
        }
        head = element
    }

    fun addLast(value: T) {
        val element = Element(value)
        if (head == null) {
            head = element
        } else {
            element.prev = tail
            tail!!.next = element
        }
        tail = element
    }

    fun removeLast() : T? {
        if (head == null) return null
        val value = tail?.value
        tail = tail?.prev
        tail?.next = null
        if (tail == null) {
            head = null
        }
        return value
    }

    internal inner class Element<T>(var value: T) {
        var next: Element<T>? = null
        var prev: Element<T>? = null
    }
}