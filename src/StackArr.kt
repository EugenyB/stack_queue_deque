class StackArr<T>(capacity: Int) {
    private val arr: Array<Any?> = arrayOfNulls(capacity)
    private var size = 0

    val isEmpty: Boolean
        get() = this.size == 0

    constructor() : this(100)

    fun push(value: T): Boolean {
        if (size + 1 == arr.size) return false
        arr[size++] = value
        return true
    }

    fun pop(): T? {
        return if (size == 0) null else arr[--size] as T?
    }

}