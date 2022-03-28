class QueueArr<T>(capacity: Int) {
    private val arr1: Array<Any?> = arrayOfNulls(capacity)
    private val arr2: Array<Any?> = arrayOfNulls(capacity)
    private var size = 0
    private var p1 = 0
    private var p2 = 0

    val isEmpty: Boolean
        get() = this.size == 0

    constructor() : this(100)

    fun push(value: T): Boolean {
        if (p1+p2 + 1 == arr1.size) return false
        arr1[p1++] = value
        size++
        return true
    }

    fun poll(): T? {
        if (size == 0) return null
        if (p2==0) {
            while (p1>0) {
                arr2[p2++] = arr1[--p1]
            }
        }
        size--
        return arr2[--p2] as T?
    }
}